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
