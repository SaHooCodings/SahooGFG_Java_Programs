class Solution
{
    String modify (String s)
    {
        // your code here
        char[] ch = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start<end)
        {
            if(isVowel(ch[start]) && isVowel(ch[end]))
            {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            else if(isVowel(ch[start]))
            {
                  end--;
            }
            else
            {
                start++;
            }
        }
        return new String(ch);
    }
    boolean isVowel(char c)
    {
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')  return true;
        
        return false;
    }
}
