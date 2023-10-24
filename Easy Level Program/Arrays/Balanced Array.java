class Solution
{
    long minValueToBalance(long a[] ,int n)
    {
        long lSum = 0;
        long rSum = 0;
        int mid = n/2;
        for(int i = 0;i < mid;i++)
        {
            lSum += a[i];
        }
        for(int i = mid;i < n;i++)
        {
            rSum += a[i];
        }
        long sum = lSum-rSum;
        if(sum<0) return (-1)*sum;
        return sum;
    }
}
