import java.util.*;

class Main {
    
    public String solution(String x) {
      
        char[] s = x.toCharArray();
        int lt = 0, rt=x.length()-1;
        while(lt<rt) {
            if(((s[lt]>='a' && s[lt]<='z') || (s[lt]>='A' && s[lt] <='Z'))
            && ((s[rt]>='a' && s[rt]<='z') || (s[rt]>='A' && s[rt] <='Z')))
            {
              char tmp = s[lt];
              s[lt] = s[rt];
              s[rt] = tmp;
              lt++;
              rt--;
            }
            else
            {
              lt++;
              rt--;
              continue;
            }
        }
        String tmp = String.valueOf(s);
        return tmp;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    
}
/* 모범답
import java.util.*;

class Main {
    
    public String solution(String x) {
      
        char[] s = x.toCharArray();
        int lt = 0, rt=x.length()-1;
        while(lt<rt) {
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else
            {
              char tmp = s[lt];
              s[lt] = s[rt];
              s[rt] = tmp;
              lt++;
              rt--;
            }
        }
        String tmp = String.valueOf(s);
        return tmp;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    
}
*/
