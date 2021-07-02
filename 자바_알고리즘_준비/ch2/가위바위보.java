import java.util.Scanner;

public class Main {

    public String[] solution(int[] A, int[] B){
        String[] answer = new String[A.length];

        for(int i=0;i<A.length;i++) {
            if(A[i] == B[i]) answer[i] = "D";
            else if( (A[i] == 1 && B[i] == 3) || (A[i] == 2 && B[i] == 1) || (A[i] == 3 && B[i] == 2)) answer[i] = "A";
            else answer[i] = "B";
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        for(int i=0;i<n;i++) A[i] = kb.nextInt();
        for(int i=0;i<n;i++) B[i] = kb.nextInt();

        for(String s : T.solution(A,B))
        {
            System.out.println(s);
        }

    }
}
