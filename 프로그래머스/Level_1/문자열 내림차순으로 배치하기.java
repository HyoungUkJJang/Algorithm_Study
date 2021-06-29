import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        Arrays.sort(arr);
        ArrayList<String> answer = new ArrayList<>(Arrays.asList(arr));
        Collections.reverse(answer);
        return answer.toString().replaceAll("[^a-zA-Z]","");
        
    }
}
