class Solution {
    long findNth(long N)
    {
        //code here
        long sum = 0;
        long p = 1;
        while(N>0)
        {
            sum+=(p*(N%9));
            p*=10;
            N/=9;
        }
        return sum;
    }
}
