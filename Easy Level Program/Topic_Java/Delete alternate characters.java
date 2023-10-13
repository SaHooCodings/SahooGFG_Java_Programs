class Solution {
    static String delAlternate(String S) {
        // code here
        String s = "";
        for(int i = 0;i < S.length();i+=2)
        {
            s+=S.charAt(i);
        }
        return s;
    }
}
