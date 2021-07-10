import java.util.*;
class Solution {
    public int solution(String skill, String[] skill_trees) {
        
        Stack<Character> stack = new Stack<>();
        int answer = 0;
        
        char[] arr = skill.toCharArray();
        
        for (int i = 0; i < skill_trees.length; i++) {

            for(int k=arr.length-1; k>=0; k--) stack.push(arr[k]); // 스텍에 거꾸로 출력시켜줌
            int count=0;
            char[] skills = skill_trees[i].toCharArray();

            for(int j=0;j<skills.length;j++)
            {
                if(stack.isEmpty()){
                    break;
                }
                else if(stack.peek() == skills[j])  {
                        stack.pop();
                        count++;
                }
                else if(skill.indexOf(skills[j]) < 0 ) count++;
            }

            if(stack.isEmpty() || count==skills.length) answer++;

        }
        
        
        
        return answer;
    }
}
