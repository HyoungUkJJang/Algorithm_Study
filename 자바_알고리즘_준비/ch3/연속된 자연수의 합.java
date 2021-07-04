import java.util.Scanner;

public class Main {

    public int solution(int k){
        int answer = 0;

        for(int i=1;i<k;i++) {
            int sum=0;
            for(int j=i;j<k;j++) {
                sum+=j;
                if(sum == k) {
                    answer++;
                    break;
                }
                else if(sum > k) break;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
     //   int n = kb.nextInt();
        int k = kb.nextInt();
    //    int[] arr1 = new int[n];
    //    for(int i=0;i<n;i++) arr1[i] = kb.nextInt();

        System.out.println(T.solution(k));

    }
}
