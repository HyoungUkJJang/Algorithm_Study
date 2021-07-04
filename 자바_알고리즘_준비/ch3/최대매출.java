// 타임에러
import java.util.Scanner;

public class Main {

    public int solution(int[] arr1, int k){
        int answer = Integer.MIN_VALUE;
        
        for(int i=0;i<arr1.length-k;i++) {
            int sum=0;
            for(int j=i;j<k+i;j++) {
                sum+=arr1[j];
            }
            if(sum>answer) answer=sum;
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
// 내가 수정한답
/*

import java.util.Scanner;

public class Main {

    public int solution(int[] arr1, int k){
        int answer = 0;
        for(int i=0;i<k;i++) answer+=arr1[i];
        for(int i=k,j=k-1,n=k-2; i<arr1.length;i++,j++,n++) {
            int sum=arr1[i] + arr1[j] + arr1[n];
            if(sum>answer) answer=sum;
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

/* 이상적인 답
import java.util.Scanner;

public class Main {

    public int solution(int[] arr1, int k){
        int answer = 0,sum=0;
        for(int i=0;i<k;i++) sum+=arr1[i];
        answer=sum;
        for(int i=k;i<arr1.length;i++) {
            sum+=(arr1[i]-arr1[i-k]);
            answer = Math.max(answer,sum);
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
