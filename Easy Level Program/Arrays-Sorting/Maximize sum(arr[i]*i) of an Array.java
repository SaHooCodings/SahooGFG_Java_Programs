class Solution{
    
    int Maximize(int arr[], int n)
    {
        // Complete the function
        long mod = 1000000007;
        Arrays.sort(arr);
        long sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum=(sum+(long)arr[i]*i)%mod;
        }
        return (int)sum;
    }   
}
