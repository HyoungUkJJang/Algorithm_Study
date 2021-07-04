import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public char solution(int n, String str){
        HashMap<Character, Integer> answer = new HashMap<>();
        int max=Integer.MIN_VALUE;
        char ch='\0';
        for(char x : str.toCharArray()) {
            answer.put(x,answer.getOrDefault(x,0)+1);

        }
        // answer.containsKey('A') A라는 키가 있는지 확인 리턴값 boolean
        // answer.size() 키의 개수 반환
        // answer.remove('key') 삭제
        for(char key : answer.keySet()) {
            if(answer.get(key) > max) {
                max = answer.get(key);
                ch = key;
            }
        }

        return ch;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n,str));
    }
}
