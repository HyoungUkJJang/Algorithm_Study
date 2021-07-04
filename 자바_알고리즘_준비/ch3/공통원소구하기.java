
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public char[] solution(int[] arr1,int[] arr2){

        String arr1_String = "";
        String answer="";
        for(int i=0;i<arr1.length;i++) arr1_String+=String.valueOf(arr1[i]);

        for(int i=0;i<arr2.length;i++)  if( arr1_String.indexOf(String.valueOf(arr2[i])) >= 0 && answer.indexOf(String.valueOf(arr2[i])) == -1) answer+=String.valueOf(arr2[i]);


        char[] arr = answer.toCharArray();
        Arrays.sort(arr);

        return arr;
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

        for(char s : T.solution(arr1,arr2)) {
            System.out.print(s+" ");
        }

    }
}
