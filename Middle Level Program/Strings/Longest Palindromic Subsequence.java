class Solution
{
    public int longestPalinSubseq(String S)
    {
        //code here
        int n = S.length();
        StringBuilder s = new StringBuilder(S);
        s.reverse();
        String t = s.toString();
        int arr[][] = new int[n+1][n+1];
        
        for(int i = n;i >= 0;i--)
        {
            for(int j = n;j >= 0;j--)
            {
                if(i == n||j == n)  arr[i][j] = 0;
                else
                {
                    if(S.charAt(i)==t.charAt(j))
                    {
                        arr[i][j] = 1+arr[i+1][j+1];
                    }
                    else
                    {
                        arr[i][j] = max(arr[i+1][j],arr[i][j+1]);
                    }
                }
            }
        }
        return arr[0][0];
    }
    static int max(int a, int b)
    {
        if(a>b) return a;
        return b;
    }
}
