class Solution
{
    //Function to return list containing first n fibonacci numbers.
    public static long[] printFibb(int n) 
    {
        //Your code here
        long[] a = new long[n];
        a[0] = 1;
        if(n==1)  return a;
        a[1] = 1;
        for(int i = 2;i < n;i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        return a;
    }
}
