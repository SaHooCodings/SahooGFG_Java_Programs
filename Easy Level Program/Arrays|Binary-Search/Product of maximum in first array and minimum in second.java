class Solution{
    
    // Function for finding maximum and value pair
    public static long find_multiplication (int arr[], int brr[], int n, int m) {
        // Complete the Function
        int first = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] > first)
            {
                first = arr[i];
            }
        }
        for(int i = 0;i < m;i++)
        {
            if(brr[i] < second)
            {
                second = brr[i];
            }
        }
        return first*second;
    }
}
