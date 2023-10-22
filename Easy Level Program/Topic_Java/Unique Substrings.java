class Solution{
    public static int unique_substring(String str)
    {
        //Your code here
        HashSet<String> set = new HashSet<>();
        for(int i = 0;i < str.length();i++)
        {
            String w = "";
            for(int j = i; j < str.length();j++)
            {
                w = w+str.charAt(j);
                set.add(w);
            }
        }
        return set.size();
    }
}
