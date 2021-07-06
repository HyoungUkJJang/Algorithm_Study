import java.util.*;

public class Main {

    /**
     * 피보나치
     */

    public int DFS(int n) {

        if(n==1 || n==2) return 1;
        else {
            return DFS(n-2)+DFS(n-1);
            // return n*DFS(n-1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        //System.out.println(T.DFS(5));
        for(int i=1;i<=10;i++ ) System.out.print(T.DFS(i) + " ");


    }
}
/* 좀 잘하는 사람

public class Main {
    static int[] fibo;
    /**
     * 피보나치
     */

    public int DFS(int n) {

        if(n==1 || n==2)
        { return fibo[n] = 1;
        }
        else {
            return fibo[n] = DFS(n-2)+DFS(n-1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        //System.out.println(T.DFS(5));
       // for(int i=1;i<=45;i++ )
       // System.out.print(T.DFS(10) + " ");
        fibo = new int[11];
        T.DFS(10);
        for(int i=1; i<=10;i++) System.out.print(fibo[i]+" ");

    }
}
*/
  /* 더 빠르게
  import java.util.*;

public class Main {
    static int[] fibo;
    /**
     * 피보나치
     */

    public int DFS(int n) {
        if(fibo[n]>0) return fibo[n];
        if(n==1 || n==2)
        { return fibo[n] = 1;
        }
        else {
            return fibo[n] = DFS(n-2)+DFS(n-1);
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        //System.out.println(T.DFS(5));
       // for(int i=1;i<=45;i++ )
       // System.out.print(T.DFS(10) + " ");
        fibo = new int[46];
        T.DFS(45);
        for(int i=1; i<=45;i++) System.out.print(fibo[i]+" ");

    }
}
  */
  
