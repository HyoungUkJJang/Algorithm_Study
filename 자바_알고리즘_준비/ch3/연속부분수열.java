import java.util.Scanner;

public class Main {

    public int solution(int[] arr, int k){
        int answer = 0;

        for(int i=0;i<arr.length;i++) {
            int sum=0;
            for(int j=i;j<arr.length;j++) {
                sum+=arr[j];
                if(sum == k) {
                    answer++;
                    break;
                }
                else if(sum > k) break;
            }
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
