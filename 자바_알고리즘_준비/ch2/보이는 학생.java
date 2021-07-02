import java.util.Scanner;

public class Main {

    public int solution(int[] arr){

        int count=1;
        if(arr.length > 0){
            for(int i=1;i<arr.length;i++){
                if(arr[i] > arr[i-1]) count++;
            }
        }
        return count;
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
