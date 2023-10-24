class Compute 
{
    public long[] minAnd2ndMin(long a[], long n)  
    {
        long f = Long.MAX_VALUE;
        long s = Long.MAX_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(a[i] < f)
            {
                s = f;
                f = a[i];
            }
            else if(a[i] < s && a[i]!=f)
            {
                s = a[i];
            }
        }
        long res[] = new long[2]; 
        if(s == Long.MAX_VALUE || f == Long.MAX_VALUE)
        {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
            res[0] = f;
            res[1] = s;
        return res;
    }
}
