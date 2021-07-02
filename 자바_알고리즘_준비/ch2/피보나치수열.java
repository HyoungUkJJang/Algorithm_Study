import java.util.Scanner;

public class Main {

    public int[] solution(int n){

        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        answer[2]=2;
        for(int i=3;i<n;i++) answer[i] = answer[i-1]+answer[i-2];

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        for(int x : T.solution(n))
        {
            System.out.print(x+" ");
        }

    }
}
/* 배열을 안쓸경우
import java.util.Scanner;

public class Main {

    public void solution(int n){
        int a=1,b=1,c;
        System.out.print(a+" "b+" ");
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c+" ");
            a=b;
            b=c;
        }
        int[] answer = new int[n];
        answer[0]=1;
        answer[1]=1;
        answer[2]=2;
        for(int i=3;i<n;i++) answer[i] = answer[i-1]+answer[i-2];

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        T.solution(n)

    }
}

*/
