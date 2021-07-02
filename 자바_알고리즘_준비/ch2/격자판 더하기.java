import java.util.Scanner;

public class Main {

    public int solution(int n,int[][] arr){
        int max = Integer.MIN_VALUE;
        int col_sum=0;
        int row_sum=0;
        int left_sum=0;
        int right_sum=0;

        for(int i=0;i<n;i++) {
            col_sum=0;
            row_sum=0;
            for(int j=0;j<n;j++) {
                col_sum+=arr[i][j];
                row_sum+=arr[j][i];
            }
           max=Math.max(max,col_sum);
            max=Math.max(max,row_sum);
        }

        for(int i=0;i<n;i++)
        {
            left_sum += arr[i][i];
            right_sum += arr[i][n-i-1];
        }
        max = Math.max(max,left_sum);
        max = Math.max(max,right_sum);


        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,arr));

    }
}
