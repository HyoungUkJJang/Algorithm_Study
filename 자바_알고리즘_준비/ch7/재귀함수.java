public class Main {

    /**
     * 재귀함수는 자기 자신을 호출하는 함수
     * 반복문의 형태라고 생각하자 !
     * 스텍프레임 - 해당 재귀가 호출되면서 그 라인을 기억하고 다음 스택(재귀)이 쌓이면서 위에서 아래로 차례로 다시 수행된다.
     */

    public void DFS(int n) {

        if(n==1) return;
        else {
            //System.out.println(n); 321
            DFS(n - 1);
            System.out.println(n); //123
        }
    }
    public static void main(String[] args) {
        Main T = new Main();
        T.DFS(3);

    }
}
