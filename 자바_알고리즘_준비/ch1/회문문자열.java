import java.util.*;

class Main {
    
    public String solution(String x) {
        x = x.toUpperCase();
        char[] s = x.toCharArray();
        
        int lt = 0, rt=x.length()-1;
        
        while(lt<rt) {
              char tmp = s[lt];
              s[lt] = s[rt];
              s[rt] = tmp;
              lt++;
              rt--;
            }
        String tmp = String.valueOf(s);

        if(x.equals(tmp)) return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    
}
/* 내가 푼 다른답
import java.util.*;

class Main {
    
    public String solution(String x) {
        x = x.toUpperCase();
      	int len = x.length();
     	for(int i=0;i<len/2;i++) {
        	if(x.charAt(i) == x.charAt(len-1)) len--;
          	else return "NO";
        }
      return "YES";
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    
}
*/
/* 모범답안

import java.util.*;

class Main {
    
    public String solution(String x) {
        x = x.toUpperCase();
      	int len = x.length();
     	for(int i=0;i<len/2;i++) {
        	if(x.charAt(i) != x.charAt(len-i-1)) {
            return "NO";
          }
        }
          	else return "YES";
      }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }
    
}

*/
