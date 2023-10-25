class Sol
{
    int[] count (String s)
    {
        // your code here 
        int[] ans = {0,0,0,0};
        for(int i = 0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                ans[0]++;
            }
            else if(Character.isLowerCase(s.charAt(i)))
            {
                ans[1]++;
            }
            else if(Character.isDigit(s.charAt(i)))
            {
                ans[2]++;
            }
            else
            {
                ans[3]++;
            }
        }
        return ans;
    }
}
