import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> Q = new LinkedList<>();
        int answer = 0;
        int max_weight=0;
        int idx = 0;
        while (true) {
            if (idx == truck_weights.length) break;
            if (Q.size() == bridge_length) {
                max_weight-=Q.poll();
            }
            else if(max_weight+truck_weights[idx] > weight) {
                Q.offer(0);
                answer++;
            }
            else {
                Q.offer(truck_weights[idx]);
                max_weight+=truck_weights[idx];
                idx++;
                answer++;
            }
        }

        return answer+bridge_length;
    }
}
