class Solution
{
    //Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String line)
    {
        // Your code
        int maxi = 0;
        char result = '0';
        char[] ch = line.toCharArray();
        int[] arr = new int[26];
        for(int i = 0;i < ch.length;i++)
        {
            char c = ch[i];
            arr[c-'a']++;
        }
        for(int i = 0;i < arr.length;i++)
        {
            if(arr[i] > maxi)
            {
                maxi = arr[i];
                result = (char)(i+'a'); 
            }
        }
        return result;
    }
}
