import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        
        ArrayList<String> part = new ArrayList(Arrays.asList(participant));
        ArrayList<String> complet = new ArrayList(Arrays.asList(completion));
        int index = 0;
        for(int i=0;i<part.size();i++)
        {  
            if (Collections.frequency(part, part.get(i)) != Collections.frequency(complet, part.get(i)))
            {
                index = i;
                break;
            }
                
        }
        return part.get(index);
    }
}
