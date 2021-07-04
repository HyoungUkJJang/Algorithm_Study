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
/* 시간복잡도 줄이기
import java.util.Scanner;

public class Main {

    public int solution(int[] arr,int k){
        int answer = Integer.MIN_VALUE;
        int cnt=0,lt=0;
        for (int rt = 0; rt < arr.length; rt++) {
            if(arr[rt]==0) cnt++;
            while(cnt>k) {
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer=Math.max(answer,rt-lt+1);
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
*/
