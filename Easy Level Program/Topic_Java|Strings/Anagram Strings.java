class Solution 
{
    static int areAnagram(String S1, String S2) 
    {
        // code here
        if(S1.length() != S2.length())
        {
            return 0;
        }
        int hash[] = new int[256];
        for(int i = 0;i < 256;i++) hash[i]=0;
        for(int i = 0;i < S1.length();i++)
        {
            hash[(int)S1.charAt(i)]++;
            hash[(int)S2.charAt(i)]--;
        }
        for(int i = 0;i < 256;i++)
        {
            if(hash[i] != 0) return 0;
        }
        return 1;
    }
}
