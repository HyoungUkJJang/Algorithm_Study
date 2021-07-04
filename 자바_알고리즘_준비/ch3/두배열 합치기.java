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
