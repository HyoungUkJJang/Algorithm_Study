import java.util.*;


public class Main {

    public int[] solution(int[] arr)
    {
        for(int i=0;i<arr.length;i++) {
            int tmp=0;
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(arr)) {
            System.out.print(x+" ");
        }
    }
}
