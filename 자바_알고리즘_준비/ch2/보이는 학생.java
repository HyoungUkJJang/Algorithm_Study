import java.util.Scanner;

public class Main {

    public int solution(int[] arr){
        int max=arr[0];
        int count=1;
            for(int i=1;i<arr.length;i++){
                    if(arr[i] > max) {
                        count++;
                        max=arr[i];
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
