import java.util.*;

class Main{
    public String solution(String str){
        String answer = "";
        char[] arr = str.toCharArray();
        for(char c : arr) {
            if(answer.indexOf(c) < 0 ) answer+=c;
            else continue;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}

/* 모범답

import java.util.*;

class Main{
    public String solution(String str){
        String answer = "";
        for(int i=0;i<str.length();i++)
        {
        if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Main T = new Main();
        System.out.println(T.solution(str));
    }
}

*/
