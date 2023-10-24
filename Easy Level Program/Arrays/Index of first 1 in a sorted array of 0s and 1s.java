class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
        long l = 0;
        long r = n-1;
        return firsty(arr,l,r);
    }
    long firsty(long arr[], long l, long r)
    {
        while(l <= r)
        {
            int mid = (int) (l+r)/2;
            if(arr[mid] == 1 && (mid==0 || arr[mid-1] == 0))
            {
                return mid;
            }
            else if(arr[mid] == 1)
            {
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        return -1;
    }
}
