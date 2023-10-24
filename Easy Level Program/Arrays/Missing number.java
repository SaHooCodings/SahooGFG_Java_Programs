class Compute {
    
    public static int missingNumber(int A[], int N)
    {
        // Your code goes here
        int sum = 0;
        int num = N*(N+1)/2;
        for(int i = 0;i < N;i++)
        {
            sum+=A[i];
        }
        return num-sum;
    }
}
