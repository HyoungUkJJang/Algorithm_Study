import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, String> map = new HashMap<>();
        for(String str : phone_book) map.put(str,"original");
        
        for(String str : phone_book) {
            for(int i=1;i<str.length();i++){
                String tmp = str.substring(0,i);
                if(map.containsKey(tmp)) return false;
            }
        }
           
        return answer;
    }
}
