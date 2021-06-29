class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        try
        {
            if(Integer.parseInt(s)>=0 && (s.length()==4 || s.length()==6)) 
                return true;
            else
                return false;
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
}
