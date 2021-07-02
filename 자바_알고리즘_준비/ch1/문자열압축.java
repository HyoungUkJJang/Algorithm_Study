import java.util.Scanner;

public class Main {

    public String solution(String s) {
        int count=0;
        String answer = "";
        s=s+" ";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)) count++;
            else{
                answer+=s.charAt(i);
                if(count>1) answer+=String.valueOf(count);
                count=1;
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
