import java.util.*;


public class Main {

    public String solution(int n ,int[] arr)
    {
        String answer = "U";
        Arrays.sort(arr);
        for(int i=0; i<arr.length-1;i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
       return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
       // int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = kb.nextInt();
        System.out.println(T.solution(n,arr));
        //for(int  x : T.solution(n,arr)) System.out.print(x+" ");
    }
}
