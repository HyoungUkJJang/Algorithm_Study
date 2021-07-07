public class Main {
    static String answer = "NO";
    static int n,k ,total=0, max = Integer.MIN_VALUE;
    boolean flag = false;

    public void DFS(int L, int[] arr,int sum) {
        //if(flag) return;
        //if(sum>total/2) return;
        if(sum>k) {
            return;
        }
        else{
            max = Integer.max(max, sum);
        }
        if(L==n) {
            return;
        }
        else {

            DFS(L+1,  arr, sum+arr[L] );
            DFS(L+1,  arr, sum);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        k = kb.nextInt();
        n = kb.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        T.DFS(0,  arr,0);
        System.out.println(max);
    }
}
