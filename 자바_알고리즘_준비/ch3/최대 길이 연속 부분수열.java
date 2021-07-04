import java.util.Scanner;

public class Main {

    public int solution(int[] arr,int k){
        int answer = Integer.MIN_VALUE;
        int sum=0;
        int count = 0;
        for(int i=0;i<arr.length;i++) {
           for(int j=i;j<arr.length;j++) {
               if(arr[j] == 1) sum++;
               else if(arr[j] == 0 && count < k ) {
                   sum++;
                   count++;
               }
               else if(arr[j] == 0 && count >= k) break;
           }
           answer = Math.max(answer,sum);
           sum=0;
           count=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        System.out.println(T.solution(arr1,k));

    }
}
