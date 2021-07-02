import java.util.Scanner;

public class Main {

    public int[] solution(int[] arr){
        int[] answer = new int[arr.length];
        int rate = 1;
        int rateCount = 0;
        for(int i=0;i<arr.length;i++) {
            int pivot = arr[i];

            for(int j=0;j<arr.length;j++){
                if(pivot<arr[j]) rateCount++;
            }

            answer[i] = rate+rateCount;
            rateCount=0;
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
        for(int x : T.solution(arr)){
            System.out.print(x+" ");
        }


    }
}
