import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] number1 = {1,2,3,4,5};   
        int[] number2 = {2,1,2,3,2,4,2,5};
        int[] number3 = {3,3,1,1,2,2,4,4,5,5};
        int[] score = new int[3];
        
        for(int i=0;i<answers.length;i++) {
            if(answers[i] == number1[i%number1.length]) score[0]++;
            if(answers[i] == number2[i%number2.length]) score[1]++;
            if(answers[i] == number3[i%number3.length]) score[2]++;
        }
      
        int maxjum = Integer.max(Integer.max(score[0],score[1]),score[2]);
        ArrayList<Integer> arr = new ArrayList<>();
        if(maxjum==score[0]) arr.add(1);
        if(maxjum==score[1]) arr.add(2);
        if(maxjum==score[2]) arr.add(3);
        
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            answer[i] = arr.get(i);
        }
        
        return answer;
    }
}
