class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        for(int i = 0;i < n;i++)
        {
            int x = reverse(a[i]);
            if(x != a[i])
            {
                return 0;
            }
        }
        return 1;
    }
    static int reverse(int ele)
    {
        int s = 0;
        while(ele > 0)
        {
            s = (s*10)+(ele%10);
            ele/=10;
        }
        return s;
    }
}
