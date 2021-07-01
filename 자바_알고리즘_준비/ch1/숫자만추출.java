import java.util.Scanner;

public class Main {

    public int solution(String s){
        s=s.toUpperCase().replaceAll("[^0-9]","");
        String tmp = new StringBuilder(s).toString();
        return Integer.parseInt(tmp);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}

/* 모범
public class Main {

    public int solution(String s){
        int answer = 0;
        for(char x : s.toCharArray()){
            // 방법1 if(x>=48 && x<=57) answer=answer*10+(x-48);
            // 방법2 if(Character.isDigit(x)) answer+=x;
        }
        
        s=s.toUpperCase().replaceAll("[^0-9]","");
        String tmp = new StringBuilder(s).toString();
        return Integer.parseInt(tmp);
        
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
*/
