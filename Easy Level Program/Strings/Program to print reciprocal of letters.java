class Solution{
    static String reciprocalString(String S){
        // code here
        String s = "";
        for(int i = 0;i < S.length();i++)
        {
            if(S.charAt(i)<='z' && S.charAt(i)>='a')
            {
                s += (char)('a'+'z'-S.charAt(i));
            }
            else if(S.charAt(i)<='Z' && S.charAt(i)>='A')
            {
                s += (char)('A'+'Z'-S.charAt(i));
            }
            else
            {
                s += " ";
            }
        }
        return s;
    }
}
