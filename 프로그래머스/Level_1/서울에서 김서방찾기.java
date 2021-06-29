import java.util.*;
class Solution {
    public String solution(String[] seoul) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(seoul));
        String answer = "";
        int index = arr.indexOf("Kim");
        answer="김서방은 "+index+"에 있다";
        return answer;
    }
}
