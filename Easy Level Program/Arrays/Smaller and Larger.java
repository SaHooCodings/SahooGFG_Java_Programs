class Solve
{
    int[] getMoreAndLess(int[] arr, int n, int x)
    {
        // code here
        int l = 0;
        int r = n-1;
        int ctrs = 0;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] <= x)
            {
                ctrs = mid+1;
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        l = 0;
        r = n-1;
        int ctrl = 0;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] >= x)
            {
                ctrl = n-mid;
                r = mid-1;
            }
            else
            {
                l = mid+1;
            }
        }
        int c[] = {ctrs, ctrl};
        return c;
    }
}
