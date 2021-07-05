import java.util.*;
public class Main {

    public int solution(int[] arr, int k)
    {
        int answer = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == k) return i+1;
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

        System.out.println(T.solution(arr, k));
    }
}
