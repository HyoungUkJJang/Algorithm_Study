import java.util.*;

class Main {
    
    public String solution(String s) {
        String answer= "";
        String[] str = s.split(" ");
        for(int i=0; i<str.length-1;i++) {
            if(str[i].length() > str[i+1].length()) answer = str[i];
            else answer = str[i+1];
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
    
}

// 모범답1
/*
import java.util.*;

class Main {
    
    public String solution(String s) {
        String answer= "";
        int m =Integer.MIN_VALUE;
        String[] str = s.split(" ");
        
        for(String x : str) {
        int len = x.length();
        if(len>m){
        m=len;
        answer=x;
        }
       }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
    
}
*/

// 모범답2
/*
import java.util.*;

class Main {
    
    public String solution(String s) {
        String answer= "";
        int m =Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' ')) != -1){
          String tmp = str.substring(0,pos);
          int len=tmp.length();
          if(len>m){
            m=len;
            answer=tmp;
          }
          str = substring(pos);
        }
        String[] str = s.split(" ");
        
        for(String x : str) {
        int len = x.length();
        if(len>m){
        m=len;
        answer=x;
        }
       }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        System.out.println(T.solution(str));
    }
    
}
*/
