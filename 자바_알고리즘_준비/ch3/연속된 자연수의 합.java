import java.util.Scanner;

public class Main {

    public int solution(int k){
        int answer = 0;

        for(int i=1;i<k;i++) {
            int sum=0;
            for(int j=i;j<k;j++) {
                sum+=j;
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
     //   int n = kb.nextInt();
        int k = kb.nextInt();
    //    int[] arr1 = new int[n];
    //    for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        System.out.println(T.solution(k));

    }
}
/* 시간복잡도 O(n)
import java.util.Scanner;

public class Main {

    public int solution(int k){
        int answer = 0, lt=1;
        int sum=0;
        int m=k/2+1;
        // n을 2로나눈 몫까지만 더해도된다..
        for(int rt=1;rt<=m;rt++) {
            sum+=rt;
            if(sum==k) answer++;
            while(sum>=k) {
                sum-=lt++;
                if(sum==k) answer++;
              }
            }
        return answer;
        }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        //   int n = kb.nextInt();
        int k = kb.nextInt();
        //    int[] arr1 = new int[n];
        //    for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        System.out.println(T.solution(k));

    }
}
*/
/* 수학적인 방법을 이용
import java.util.Scanner;

public class Main {

    public int solution(int k){
        int answer = 0, cnt=1;

        k--;
        while(k>0){
            cnt++;
            k=k-cnt;
            if(k/cnt==0) answer++;
        }

        return answer;
        }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        //   int n = kb.nextInt();
        int k = kb.nextInt();
        //    int[] arr1 = new int[n];
        //    for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        System.out.println(T.solution(k));

    }
}
*/
