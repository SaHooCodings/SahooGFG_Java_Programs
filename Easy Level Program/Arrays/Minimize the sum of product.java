class Solution {

    public long minValue(long a[], long b[], long n) 
    {
        // Your code goes here
        long sum = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i = 0;i < (int)n;i++)
        {
            sum += a[i]*b[(int)(n)-i-1];
            //sum+=mul;
        }
        return sum;
    }
}
