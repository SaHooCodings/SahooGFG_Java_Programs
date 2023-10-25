class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = str.length();
        int m = patt.length();
        int minIndex = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(!hm.containsKey(str.charAt(i)))
            {
                hm.put(str.charAt(i),i);
            }
        }
        for(int i = 0;i < m;i++)
        {
            if(hm.containsKey(patt.charAt(i))&&hm.get(patt.charAt(i))<minIndex)
            {
                minIndex = hm.get(patt.charAt(i));
            }
        }
        if(minIndex!=Integer.MAX_VALUE)
        {
            return minIndex;
        }
        return -1;
    }
}
