class Solution 
{ 
    String merge(String S1, String S2)
    { 
        // code here
        String s = "";
        int n = S1.length();
        int m = S2.length();
        int start = 0;
        int end = 0;
        while(start < n && end < m)
        {
            s += S1.charAt(start);
            s += S2.charAt(end);
            start++;
            end++;
        }
        while(start < n)
        {
            s += S1.charAt(start);
            start++;
        }
        while(end < m)
        {
            s += S2.charAt(end);
            end++;
        }
        return s;
    }
} 
