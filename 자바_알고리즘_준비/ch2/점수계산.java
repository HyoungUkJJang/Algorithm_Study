import java.util.Scanner;

public class Main {

    public int solution(int[] arr){

        int sum=0;
        int pivotJumsu=1;
        for(int i=0; i<arr.length;i++) {
            if(arr[i] == 1){
                sum+=pivotJumsu++;
            }
            else {
                pivotJumsu=1;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));


    }
}
