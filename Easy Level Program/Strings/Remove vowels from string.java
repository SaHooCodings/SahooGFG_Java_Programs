class Solution {
    String removeVowels(String S) {
        // code here
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < S.length();i++)
        {
            char ch = S.charAt(i);
            if(!isVowel(ch))
            {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
        return true;
    return false;
    }
}
