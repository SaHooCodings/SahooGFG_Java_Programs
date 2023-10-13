class Solution {
    static String conRevstr(String S1, String S2) 
    {
        // code here
        String S = S1 + S2;
        String s = "";
        for(int i = S.length()-1;i >= 0;i--)
        {
            s += S.charAt(i);
        }
        return s;
    }
}
