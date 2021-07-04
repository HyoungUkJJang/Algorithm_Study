import java.util.*;

class Main {
    public int[] solution(int[] arr1,int[] arr2){

        int[] answer = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length;i++) answer[i] = arr1[i];
        for(int i=arr1.length,j=0;i<answer.length;i++) answer[i] = arr2[j++];
        Arrays.sort(answer);
        
        return answer;

    }
     public static void main(String[] args)
    {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n =kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) arr2[i] = kb.nextInt();

        for(int x : T.solution(arr1,arr2)) {
            System.out.print(x+" ");
        }

    }
}
/*인상적인 답
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int m,int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0,p2=0;

        while(p1<n && p2<m) {
            if(arr1[p1] > arr2[p2])
                answer.add(arr2[p2++]);
            else
                answer.add(arr1[p1++]);
        }
        if(p1==n) {
            for(int i=p2; i<m;i++) answer.add(arr2[i]);
        }
        else if(p2==n) {
            for(int i=p1; i<n;i++) answer.add(arr1[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];
        for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        int m = kb.nextInt();
        int[] arr2 = new int[m];
        for(int i=0;i<m;i++) arr2[i] = kb.nextInt();

        for(int s : T.solution(n,m,arr1,arr2)) {
            System.out.print(s+" ");
        }

    }
}
*/
