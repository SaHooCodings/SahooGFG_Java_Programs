class GFG
{
    ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long> li = new ArrayList<>();
        li.add(firstOccur(arr,n,x));
        li.add(lastOccur(arr,n,x));
        return li;
    }
    long firstOccur(long arr[], int n, int k)
    {
        int low = 0;
        int high = n-1;
        long result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == k)
            {
                result = mid;
                high = mid-1;
            }
            else if(arr[mid] < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }
    long lastOccur(long arr[], int n, int k)
    {
        int low = 0;
        int high = n-1;
        long result = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid] == k)
            {
                result = mid;
                low = mid + 1;
            }
            else if(arr[mid] < k)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return result;
    }
}
