class Solution {
    public long[] findElements( long a[], long n)
    {
        // Your code goes here
        Arrays.sort(a);
        long b[] = new long[(int)n-2];
        //if(a.length>2)
        //{
        for(int i = 0;i < n-2;i++)
        {
            b[i] = a[i];
        }
        //}
        return b;
    }
}
