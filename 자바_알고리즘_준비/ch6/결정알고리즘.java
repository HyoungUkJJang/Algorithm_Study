import java.util.*;

public class Main {

    public int solution(int[] arr, int k) {

        int max=Integer.MIN_VALUE;
        int sum=0,sum2=0;
        for(int x : arr) sum+=x;
        sum/=k;

        for(int i=0;i<arr.length-1;i++) {
                sum2+=arr[i];
                //System.out.println("sum2 = "+sum2);
                if(sum2+arr[i+1] > sum) {
                    if(i+1==arr.length-1){
                        sum2+=arr[i+1];
                        //System.out.println("Last = "+sum2);
                    }

                    max = Integer.max(max,sum2);
                    sum2=0;
                }
        }
        //System.out.println(max);
        return max;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        //T.solution(arr,k);
        System.out.print(T.solution(arr,k));
    }
}
