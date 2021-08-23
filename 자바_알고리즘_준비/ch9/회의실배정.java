import java.util.*;
import java.util.stream.Collectors;

class Body implements Comparable<Body> {
    public int s,e;

    Body(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Body o) {

        if(o.e == this.e) return o.s - this.s;
        return o.e - this.e;
    }
}

public class Main {

    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr, Collections.reverseOrder()); // 오름차순
        int endHour = Integer.MIN_VALUE;
        for (Body body : arr) {
            if (body.s >= endHour) {
                endHour = body.e;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Body> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int s = kb.nextInt();
            int e = kb.nextInt();
            arr.add(new Body(s, e));
        }

        System.out.println(T.solution(arr,n));

    }

}
