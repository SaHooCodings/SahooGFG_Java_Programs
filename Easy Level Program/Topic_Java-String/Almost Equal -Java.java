class Geeks{
    
    static int coutChars(String s1, String s2)
    {
       //Your code here
       int fq1[] = new int[26];
       int fq2[] = new int[26];
       for(int i = 0;i < s1.length();i++)
       {
           fq1[s1.charAt(i)-'a']++;
       }
       for(int i = 0;i < s2.length();i++)
       {
           fq2[s2.charAt(i) - 'a']++;
       }
       int ans = 0;
       for(int i = 0;i < 26;i++)
       {
            ans += Math.abs(fq1[i] - fq2[i]);
       }
       return ans;
    }
}
