class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int t=x;
        int result=0;
        while(true) {
            result += t % 10;
            t=t/10;
            if(t==0) break;
        }
        
        if(x%result == 0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}
