class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
        long sum = 0;
        for(int i = 0;i < n;i++)
        {
            sum+=arr[i];
        }
        long sum2 = 0;
        for(int i = 0;i < n;i++)
        {
            sum-=arr[i];
            if(sum2==sum) return (i+1);
            sum2+=arr[i];
        }
        return -1;
    }
}
