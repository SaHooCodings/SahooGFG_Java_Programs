class Solution
{
    public int isPrime(int N)
    {
        // code here
        if(N==0||N==1){
            return 0;
        }
        for(int i = 2;i<=N-2;i++){
            if(N%i==0){
                return 0;
            }
        }
        return 1;
    }
}
