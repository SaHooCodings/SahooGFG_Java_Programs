class GfG
{
    public static Long product(Long arr[], Long mod, int n)
    {
        //yout code here
        long p = 1;
        for(int i = 0;i < n;i++)
        {
            p=(p*arr[i])%mod;
        }
        return p;
    }
}
