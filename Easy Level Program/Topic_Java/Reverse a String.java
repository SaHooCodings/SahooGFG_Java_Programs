class Solution {
    static String revStr(String S)
    {
        // code here
        String s = "";
        for(int i = S.length()-1;i >= 0;i--)
        {
            s += S.charAt(i);
        }
        return s;
    }
}
