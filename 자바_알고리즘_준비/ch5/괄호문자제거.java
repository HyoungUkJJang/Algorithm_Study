import java.util.*;

public class Main {

    public String solution(String s) {
        char[] arr = s.toCharArray();
        String answer ="";
        Stack<Character> stack = new Stack<>();

        for(char x : arr) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) answer += String.valueOf(x);
                if(x==')')  stack.pop();
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
