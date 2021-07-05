import java.util.*;


public class Main {

    public int[][] solution(int n ,int[][] arr)
    {
        for(int i=0; i<n-1;i++) {
            for(int j=0;j<n-i-1;j++) {
                if(arr[j][0]>arr[j+1][0]) {
                    int tmp1 = arr[j][0];
                    int tmp2 = arr[j][1];
                    arr[j][0] = arr[j+1][0];
                    arr[j][1] = arr[j+1][1];
                    arr[j+1][0] = tmp1;
                    arr[j+1][1] = tmp2;
                }
                else if(arr[j][0] == arr[j+1][0]){
                    if(arr[j][1] > arr[j+1][1]){
                        int tmp1 = arr[j][0];
                        int tmp2 = arr[j][1];
                        arr[j][0] = arr[j+1][0];
                        arr[j][1] = arr[j+1][1];
                        arr[j+1][0] = tmp1;
                        arr[j+1][1] = tmp2;
                    }
                }
            }
        }
       return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = kb.nextInt();
            }
        }
        int[][] result = T.solution(n, arr);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/* 모범답
import java.util.*;

class Point implements Comparable<Point>{
    public int x, y;
    Point(int x, int y){
        this.x =x;
        this.y = y;
    }
    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y-o.y; // 음수를 만들어라 
        else return this.x-o.x;
    }

}
public class Main {

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " " + o.y);
        }
}
*/
