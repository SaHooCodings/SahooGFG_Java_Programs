class Complete{
    // Function for finding maximum and value pair
    public static int multiply (int arr[], int n) {
        //Complete the function
        int mid = n/2;
        int l = 0;
        int r = n-1;
        int lSum = 0;
        int rSum = 0;
        for(int i = 0;i < mid;i++)
        {
            lSum += arr[i];
        }
        for(int i = mid;i < n;i++)
        {
            rSum += arr[i];
        }
        return lSum*rSum;
    }
}
