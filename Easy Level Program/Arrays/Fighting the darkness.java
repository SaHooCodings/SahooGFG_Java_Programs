class Solution{
    long maxDays(long arr[], int n){
        // code here
        long maxi = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] > maxi)
            {
                maxi = arr[i];
            }
        }
        return maxi;
    }
}
