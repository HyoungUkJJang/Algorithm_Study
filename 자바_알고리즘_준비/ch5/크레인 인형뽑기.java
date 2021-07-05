import java.util.*;

public class Main {

    public int solution(int[][] arr,int[] move) {
        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for(int x : move) {
            for(int i=0;i<arr.length;i++) {
                if(arr[i][x-1] != 0)
                {
                    if(stack.isEmpty()) {
                        stack.push(arr[i][x-1]);
                        arr[i][x-1]=0;
                    }
                    else if(stack.peek() == arr[i][x-1]) {
                        stack.pop();
                        answer+=2;
                        arr[i][x-1] = 0;
                    }
                    else {
                        stack.push(arr[i][x-1]);
                        arr[i][x-1] = 0;
                    }
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int move_count = kb.nextInt();
        int[] move = new int[move_count];
        for (int i = 0; i < move_count; i++) {
            move[i] = kb.nextInt();
        }

        System.out.println(T.solution(arr,move));
    }
}
