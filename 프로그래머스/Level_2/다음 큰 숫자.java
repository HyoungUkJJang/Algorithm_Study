class Solution {
    public int solution(int n) {
        String binary = Integer.toBinaryString(n).toString().replace("0","");
        int len = binary.length();
        while(true) {
            String br = Integer.toBinaryString(++n).toString().replace("0","");
            if(len == br.length()) return n;
        }
    }
}
