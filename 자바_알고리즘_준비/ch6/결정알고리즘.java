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
/* 정답
import java.util.*;

public class Main {

    public int count(int[] arr, int capacity){
        int cnt=1;
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            if(sum+arr[i]>capacity) {
                cnt++;
                sum=arr[i];
            }
            else sum+=arr[i];

        }
        return cnt;
    }

    public int solution(int[] arr, int k) {

        int answer=0;
        int lt=Arrays.stream(arr).max().getAsInt();
        int rt=Arrays.stream(arr).sum();

        while(lt<=rt){
            int mid=(lt+rt)/2;
            if(count(arr,mid)<=k) {
                answer=mid;
                rt=mid-1;
            }
            else{
                lt=mid+1;
            }

        }
        return answer;
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
*/
