import java.util.*;
class Solution {
    public String solution(String s) {
        String answer="";
        String[] arr = s.split(" ");
        int[] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;i++) arr2[i] = Integer.parseInt(arr[i]);
        Arrays.sort(arr2);

        answer = Arrays.stream(arr2).min().getAsInt() + " " + Arrays.stream(arr2).max().getAsInt();

        return answer;
    }
}
