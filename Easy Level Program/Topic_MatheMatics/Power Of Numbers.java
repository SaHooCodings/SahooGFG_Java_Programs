class Solution
{
        
    long power(int N,int R)
    {
        //Your code here
        if(N==0) return 0;
        if(R==0) return 1;
        long mod = 1000000007;
        long ans = power(N,R/2);
        ans = (ans*ans)%mod;
        if(R%2!=0)
        return (ans*N)%mod;
        else
        return ans;
    }

}
