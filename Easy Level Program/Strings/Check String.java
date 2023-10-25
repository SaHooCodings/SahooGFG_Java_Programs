class Sol
{
    Boolean check (String s)
    {
        // your code here 
        for(int i = 1;i < s.length();++i)
        {
            if(s.charAt(i) != s.charAt(0))  return false;
        }
        return true;
    }
}
