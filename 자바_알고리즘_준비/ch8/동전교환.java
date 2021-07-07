public class Main {
    static String answer = "NO";
    static int n,k, min = Integer.MAX_VALUE;
    static int[] krr;
    boolean flag = false;

    public void DFS(int L,int sum, int cnt ,int[] arr) {
        if(krr[sum] == 1) return;
        if(sum==k) {
            min = Math.min(min,cnt);
           // krr[min+1] = cnt;
            return;
        }
        if(sum>k) return;
        else {
            for(int i=0;i<n;i++) {
                krr[sum+arr[i]]=1;
                DFS(L + 1, sum + arr[i], cnt + 1, arr);
            }
            //DFS(L+1,  sum, cnt, arr); // 안더하면 안되는거지..?
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 동전개수
        int[] arr = new int[n]; // 동전종류 들어가있는곳
        for (int i = 0; i < n; i++) {
                arr[i] = kb.nextInt();
        }
        k = kb.nextInt(); // 거슬러 받을돈
        krr = new int[k+1]; // 개수배열로 채울공간
        T.DFS(0,  0,0 , arr);
        System.out.println(min);
    }
}
