import java.util.*;
class index {
    int p;
    int idx;
    public index(int p, int idx){
        this.p=p;
        this.idx = idx;
    }
}
class Solution {
    public int solution(int[] priorities, int location) {
        int answer=0;
        Queue<index> Q = new LinkedList<>();

        for(int i=0;i<priorities.length;i++) {
            Q.offer(new index(priorities[i],i));
        }
        while(!Q.isEmpty()) {
            index poll = Q.poll();
            int flag = 1;
            for (index idx : Q ) {
                if(idx.p > poll.p) {
                    Q.offer(poll); // 우선순위가 높은게 있다면 다시 넣어줌
                    flag=0;
                    break;
                }
            }
            if(flag==1 && poll.idx == location) return ++answer;
            if(flag==1) // 다 돌았는데 큰게 없다 그러면 한사람이 빠졋기 때문에 증가시킴
            {
                ++answer;
            }
        }
        return answer;
    }
}
