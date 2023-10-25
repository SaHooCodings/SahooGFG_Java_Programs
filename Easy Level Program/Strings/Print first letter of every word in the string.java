class Solution {
    String firstAlphabet(String S) {
        // code here
        String s = "";
        s += S.charAt(0);
        for(int i = 1;i < S.length();i++)
        {
            if(S.charAt(i)==' ' && i < S.length())
            {
                s+=S.charAt(i+1);
            }
        }
        return s;
    }
};
