public class Main {
    static int n,r;
    static int[][] dy;
    public int DFS(int n, int r) {
        if(dy[n][r]>0) return dy[n][r];
        if(n==r || r==0) return 1;
        else return dy[n][r] = DFS(n-1,r-1)+DFS(n-1,r);

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt();
        r = kb.nextInt();
        dy = new int[35][35];
        System.out.println(T.DFS(n,r));
    }
}
