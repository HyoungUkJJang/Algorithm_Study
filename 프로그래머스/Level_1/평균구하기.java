import java.util.stream.*;

class Solution {
    public double solution(int[] arr) {
        double answer = (double)IntStream.of(arr).sum() / arr.length;
        return answer;
    }
}
