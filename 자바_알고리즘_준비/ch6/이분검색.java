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
/* 이게 이분검색. 내가한건 순차탐색이엿음
import java.util.*;
public class Main {

    public int solution(int[] arr, int k)
    {
        int answer = 0;
        Arrays.sort(arr);
        int lt=0,rt=arr.length-1;

        for(int i=0;i<arr.length;i++) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == k) return mid+1;
            else if(arr[mid] < k) lt=mid+1;
            else rt=mid-1;
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
*/
