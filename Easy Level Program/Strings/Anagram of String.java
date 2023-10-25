class GfG
{
	public int remAnagrams(String s,String s1)
    {
        //add code here.
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i = 0;i < s.length();i++)
        {
            arr1[s.charAt(i) - 'a']++;
        }
        for(int i = 0;i < s1.length();i++)
        {
            arr2[s1.charAt(i) - 'a']++;
        }
        int ctr = 0;
        for(int i = 0;i < 26;i++)
        {
            ctr+=Math.abs(arr1[i] - arr2[i]);
        }
        return ctr;
    }
}
