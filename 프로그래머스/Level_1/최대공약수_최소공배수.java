class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min=0,max=0;
        int gcd=0;
        if(n<m) {
            min=n;
            max=m;
        }
        else{
            min=m;
            max=n;
        }
        for(int i=1;i<=max;i++) {
            if(n%i==0 && m%i==0) {
                answer[0] = i;
                gcd=i;
            }
        }
        answer[1] = (n*m) / gcd;
        
        
        return answer;
    }
}
