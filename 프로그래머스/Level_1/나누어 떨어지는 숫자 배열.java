import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] result = {};
        ArrayList<Integer> answer = new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]%divisor == 0) {
                answer.add(arr[i]);
                count++;
            } 
        }
        
        if(count==0) answer.add(-1);
        
        
        result = new int[answer.size()];
        
        for(int i=0; i<answer.size();i++) {
            result[i] = answer.get(i);
        }
        
        Arrays.sort(result);
        return result;
    }
}
