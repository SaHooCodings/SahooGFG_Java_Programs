class Solution 
{ 
    String convert(String s) 
    { 
        StringBuilder S = new StringBuilder();
        for(int i = 0;i <= s.length()-1;i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
            {
                int u = 'a'+'z'-s.charAt(i);
                S.append((char)u);
            }
            else
            {
                int u = 'A'+'Z'-s.charAt(i);
                S.append((char)u);
            }
        }
        return S.toString();
    }
} 
