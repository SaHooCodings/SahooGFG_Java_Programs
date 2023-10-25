class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        
        // Your code here
        if(a.length() != b.length()) return false;
        int[] hash = new int[26];
        for(int i = 0;i < 26;i++) hash[i] = 0;
        
        for(int i = 0;i < a.length();i++)
        {
            hash[a.charAt(i)-'a']++;
            hash[b.charAt(i)-'a']--;
        }
        for(int i = 0;i < 26;i++)
        {
            if(hash[i]!=0) return false;
        }
        return true;
    }
}
