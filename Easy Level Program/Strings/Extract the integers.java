class Solution 
{ 
    ArrayList<String> extractIntegerWords(String s) 
    { 
        // code here
        ArrayList<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i)<'0'||s.charAt(i)>'9')
            {
                continue;
            }
            sb.append(s.charAt(i));
            if(i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='9')
            {
                continue;
            }
            l.add(sb.toString());
            sb.delete(0,sb.length());
        }
        return l;
    }
} 
