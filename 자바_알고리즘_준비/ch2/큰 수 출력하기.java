import java.util.Scanner;

public class Main {

    public String solution(int[] arr){

        String result = arr[0] + " ";
        int count=1;
        if(arr.length > 0){
            for(int i=1;i<arr.length;i++){
                if(arr[i-1] < arr[i]) result += arr[i] +" ";
            }
        }
        return result;
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
