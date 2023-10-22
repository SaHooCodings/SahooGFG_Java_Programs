class Solution
{
    public int is_valid(String s)
    {
        // code here
        int len = s.length();
        if(len == 10)
        {
            return (s.charAt(0) == '7' || s.charAt(0) == '8' || s.charAt(0) == '9')?1:0;
        }
        else if(len == 11)
        {
            if(s.charAt(0) == '0')
            {
                return (s.charAt(1) == '7' || s.charAt(1) == '8' || s.charAt(1) == '9')?1:0;
            }
        }
        else if(len == 12)
        {
            if(s.charAt(0) == '9' && s.charAt(1) == '1')
            {
                return (s.charAt(2) == '7' || s.charAt(2) == '8' || s.charAt(2) == '9')?1:0;
            }
        }
        return 0;
    }
}
