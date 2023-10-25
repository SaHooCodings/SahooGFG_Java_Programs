class Solution
{
    //Function to calculate sum of all numbers present in a string.
    public static long findSum(String str)
    {
        // your code here
        long sum = 0;
        String s = "";
        for(char ch : str.toCharArray())
        {
            if(ch >= '0' && ch <= '9')
            {
                s += ch;
            }
            else
            {
                if(s.length() > 0)
                {
                    int num = Integer.parseInt(s);
                    sum += (long)num;
                }
                s = new String("");
            }
        }
        if(s.length() > 0)
        {
        int num = Integer.parseInt(s);
        sum += (long) num;
        }
        return sum;
    }
}
