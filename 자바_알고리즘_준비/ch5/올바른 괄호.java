import java.util.Scanner;
import java.util.Stack;

public class Main {

    public String solution(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char x : arr) {
            if(x == '(') stack.push(x);
            else if(x==')') stack.pop();
        }
        if(stack.isEmpty()) return "YES";
        else return "NO";

    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        //int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
