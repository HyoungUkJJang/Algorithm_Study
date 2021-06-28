import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        char[] arr = s.toCharArray();
        for(int i=0;i<arr.length;i++) {
            if(arr[i] == 32) {
                answer+=" ";
                continue;
            }
            else if(arr[i] >=65 && arr[i] <=90) {
                if(arr[i] + n <= 90) 
                    arr[i]+=n;
                else 
                    arr[i] = (char)(((arr[i]+n)%90)+64);
            }
            else if(arr[i] >=97 && arr[i] <=122){
                if(arr[i] + n <= 122) 
                    arr[i]+=n;
                else 
                    arr[i] = (char)(((arr[i]+n)%122)+96);
            }
            answer+=arr[i];
        }
        return answer;
    }
}
