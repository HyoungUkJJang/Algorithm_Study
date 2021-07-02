import java.util.Scanner;

public class Main {

    public String solution(int[] arr){

        String result = arr[0] + " ";
        int count=1;
        if(arr.length > 0){
            for(int i=1;i<arr.length;i++){
                if(arr[i-1] < arr[i]) result += arr[i] +" ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(arr));



    }
}

/* 모범

import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);

            for(int i=1;i<arr.length;i++){
                if(arr[i-1] < arr[i]) answer.add(arr[i]);
            }
        return result;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = kb.nextInt();
        }
        for(int x : T.soulution(n,arr)){
        System.out.println(x+" ");
        }

    }
}

*/
