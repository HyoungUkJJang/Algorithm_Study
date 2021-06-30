import java.util.*;

class Main {
    public String solution(String s) {
        String answer= "";
        for(char c : s.toCharArray()) {
            if(c >= 'a' && c <='z') 
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
         
        }
        return answer;
    }
    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }
}

// 다른답
/*
import java.util.*;

class Main {
    public String solution(String s) {
        String answer= "";
        for(char c : s.toCharArray()) {
            if(Character.inLowerCase(c)) 
                answer += Character.toUpperCase(c);
            else
                answer += Character.toLowerCase(c);
         
        }
        return answer;
    }
    public static void main(String[] args) {
        Main t = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(t.solution(str));
    }
}
*/
