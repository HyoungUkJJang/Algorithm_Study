import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] arr){

        ArrayList<Integer> answer = new ArrayList<>();
        int count=1;

        for(int i=0;i<arr.length;i++)
        {
            int pivot = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());
            if(pivot == 1) continue;

            for(int j=2;j<pivot;j++) {
                if (pivot % j == 0) {
                    count++;
                    break;
                }
            }

                if(count==1) answer.add(pivot);
                count=1;
            }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = kb.nextInt();
        }

        for(int x : T.solution(arr)) {
            System.out.print(x+" ");
        }

    }
}
