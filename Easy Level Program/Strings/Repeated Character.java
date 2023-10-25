class Solution
{
    char firstRep(String S)
    {
        // your code here
        int[] arr = new int[256];
        for(int i = 0;i < S.length();i++)
        {
            arr[S.charAt(i)]++;
        }
        for(int i = 0;i < S.length();i++)
        {
            if(arr[S.charAt(i)] > 1)
            return S.charAt(i);
        }
        return '#';
    }
}
