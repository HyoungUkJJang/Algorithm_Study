import java.util.Scanner;

public class Main {

    public int solution(int n){

        int answer = 0;
        int count=0;
        for(int i=2;i<=n;i++) {
            for(int j=1;j<=i;j++) {
                if(i%j==0) count++;
            }
            if(count==2) answer++;
            count=0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));

    }
}
/*
// 에라토스테네스
import java.util.Scanner;

public class Main {

    public int solution(int n){
        int[] ch = new int[n+1];
        int answer=0;
        for(int i=2;i<=n;i++) {
            if(ch[i]==0) {
                answer++;
                for(int j=i; j<=n; j=j+i) ch[j] = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));

    }
}

*/
