public class Main {
    static int[][] miro;
    static int[] start,finish;
    static int answer=0;

    public void DFS(int L, int[][] arr, int col, int row) {
        if(L==arr.length) return;
        else{
            if(col == 0 && row == 0) // Top Left X
            {

                DFS(L+1,arr,col,row+1); // Right
                DFS(L+1,arr,col+1,row); // down
            }
            else if(col == arr.length-1 && row == arr.length-1) {
    
            }
            else if(col == 0) {
                DFS(L+1,arr,col,row+1); // Right
                DFS(L+1,arr,col+1,row); // down
                DFS(L+1,arr,col-1,row); // TOP
            }
            
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        miro = new int[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                miro[i][j] = kb.nextInt();
            }
        }
        start = new int[2];
        finish = new int[2];
        start[0] = 0;
        start[1] = 0;
        finish[0] = miro.length-1;
        finish[1] = miro.length-1;
        T.DFS(0,miro,0,0);
    }
}
