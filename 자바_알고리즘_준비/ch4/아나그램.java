import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String str1, String str2){
        HashMap<Character, Integer> answer = new HashMap<>();
        HashMap<Character, Integer> answer2 = new HashMap<>();
        int cnt=0;
        for(char x : str1.toCharArray())  answer.put(x,answer.getOrDefault(x,0)+1);
        
        for(char x : str2.toCharArray()) answer2.put(x,answer2.getOrDefault(x,0)+1);
        if(answer.size() != answer2.size()) return "NO";
        else {
            for(char key : answer2.keySet()) {
                if(answer.get(key) == answer2.get(key)) cnt++;
            }
            if(cnt==answer.size()) return "YES";
        }
        
        
        return "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str1 = kb.next();
        String str2 = kb.next();
        System.out.println(T.solution(str1,str2));
    }
}
