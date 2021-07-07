public class Main {
    static String answer = "NO";
    static int n,k , max = Integer.MIN_VALUE;
    boolean flag = false;

    public void DFS(int L, int[][] arr,int sum, int minute) {
        if(minute>k) return;
        else{
            max = Math.max(max,sum);
        }
        if(L==n) {
            return;
        }
        else {
            DFS(L+1,arr,sum+arr[L][0],minute+arr[L][1]);
            DFS(L+1,arr,sum,minute);
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 문젝수
        k = kb.nextInt(); // 분
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        T.DFS(0,  arr,0,0);
        System.out.println(max);
    }
}
