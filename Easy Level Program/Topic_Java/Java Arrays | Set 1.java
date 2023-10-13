class Compute
{
    String average(int A[], int N)
    {
        int sum = 0;
        for(int i = 0;i < N;i++)
        {
            sum += A[i];
        }
        double avg = (double)sum/N;
        String ans = String.format("%.2f",avg);
        return ans;
    }
}
