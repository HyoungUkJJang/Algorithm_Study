public class Main {

    /**
     * 2진수로 출력해보기
     */

    public void DFS(int n) {

        if(n==0) return;
        else {
            //System.out.print(n%2 + " "); //321
            DFS(n/2);
            System.out.print(n%2 + " "); //123
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(11);

    }
}
