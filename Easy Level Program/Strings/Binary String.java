class Solution
{
    //Function to count the number of substrings that start and end with 1.
    public static int binarySubstring(int a, String str)
    {
        // Your code here
        int ctr = 0;
        for(int i = 0;i < a;i++)
        {
            if(str.charAt(i) == '1')
            ctr++;
        }
        return (ctr*(ctr-1))/2;
    }
}
