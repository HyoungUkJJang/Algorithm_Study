import java.util.*;

public class Main {

    public int solution(String str) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(char x : str.toCharArray()){
            if((x>='1' && x<='9') || stack.isEmpty()) stack.push(Integer.parseInt(String.valueOf(x)));
            else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                switch (x) {
                    case '+' :
                        stack.push(num1+num2);
                        break;
                    case '-' :
                        stack.push(num1 > num2 ? num1-num2 : num2-num1);
                        break;
                    case '*' :
                        stack.push(num1*num2);
                        break;
                    case '/' :
                        stack.push(num1/num2);
                        break;
                }
            }
        }
        answer = stack.pop();
        return answer;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
