import java.util.*;

public class Main {

    public String solution(String[] participant, String[] completion)
    {
        String answer="";
        HashMap<String, Integer> part = new HashMap<>();
        HashMap<String, Integer> complet = new HashMap<>();
        for(String x : completion) complet.put(x,complet.getOrDefault(x,0)+1);
        for (String x : participant) {
            if(!complet.containsKey(x) || complet.get(x) ==0) answer = x;
            else complet.put(x,complet.get(x)-1);
        }
        /*
        for(String x : participant) part.put(x,part.getOrDefault(x,0)+1);
        for(String x : participant) {
            if(part.get(x) != complet.get(x)) answer = x;
        }
        */
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        String[] str1 = new String[n];
        String[] str2 = new String[k];
        for(int i=0;i<n;i++) str1[i] = kb.next();
        for(int i=0;i<k;i++) str2[i] = kb.next();

        System.out.println(T.solution(str1,str2));

    }
}
