import java.util.*;

public class Main {

    public String solution(String pivot, String str)
    {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();
        for(char x : pivot.toCharArray()) Q.offer(x);
        for(char x : str.toCharArray()) {
            if(Q.contains(x)) {
                if(Q.peek() == x) Q.poll();
                else return "NO";
            }
        }
        if(Q.size() == 0) return "YES";
        else return "NO";

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

//        int n = kb.nextInt();
//        int k = kb.nextInt();
//
        String str1 = kb.next();
        String str2 = kb.next();
        //for(int i=0;i<n;i++) str1[i] = kb.next();
        //for(int i=0;i<k;i++) str2[i] = kb.next();

        System.out.println(T.solution(str1,str2));

    }
}
