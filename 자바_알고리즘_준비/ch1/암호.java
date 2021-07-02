import java.util.Scanner;

public class Main {

    public String solution(String s,int n) {
        String answer = "";
        String str = "";
        int count=0;
        for(int i=0;i<s.length();i++) {

            if(s.charAt(i) == '#') {
                str+="1";
            }
            else if(s.charAt(i) == '*') {
                str+='0';
            }

            count++;

            if(count==7) {
                answer += (char)Integer.parseInt(str,2);
                count=0;
                str="";
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str,n));
    }
}

/*
import java.util.Scanner;

public class Main {

    public String solution(String s,int n) {
        String answer = "";
        for(int i=0;i<n;i++) {
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            //tmp = tmp.replace('#','1');
            //tmp = tmp.replace('*','0');
            answer+=(char)Integer.parseInt(tmp,2);
            s=s.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str,n));
    }
}

*/
