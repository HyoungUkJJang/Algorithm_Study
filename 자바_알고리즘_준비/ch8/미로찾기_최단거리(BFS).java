import java.util.*;

class point{
    public int x,y;

    point(int x, int y) {
        this.x=x;
        this.y=y;
    }
}

public class Main {
    static int[] dx = {-1,0,1,0}; // 위아래
    static int[] dy = {0,1,0,-1}; // 왼쪽오른쪽

    static int[][] board,dis;
    static int answer=0;

    public void BFS(int x, int y) {

        Queue<point> Q = new LinkedList<>();
        Q.offer(new point(x,y));
        board[x][y] = 1;
        while (!Q.isEmpty()) {
            point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    Q.offer((new point(nx, ny)));
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <=7; i++) {
            for (int j = 1; j <=7; j++) {
                board[i][j] = kb.nextInt();
            }
        }
        T.BFS(1, 1);
        if(board[7][7] ==0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }
}
