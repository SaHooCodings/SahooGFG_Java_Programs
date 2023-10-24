class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
        if(target <= arr[0]) return arr[0];
        if(target >= arr[n-1]) return arr[n-1];
        int l = 0;
        int r = n-1;
        int mid = 0;
        while(l < r)
        {
            mid = (l+r)/2;
            if(arr[mid] == target) return arr[mid];
            else if(arr[mid] > target)
            {
                if(mid > 0 && arr[mid - 1] < target)
                {
                    return closest(arr[mid - 1], arr[mid], target);
                }
                r = mid;
            }
            else
            {
                if(mid < n && arr[mid+1] > target)
                {
                    return closest(arr[mid],arr[mid+1],target);
                }
                l = mid + 1;
            }
        }
        return arr[mid];
    }
    static int closest(int i, int j, int x)
    {
        if(x - i >= j - x)
        {
            return j;
        }
        return i;
    }
}
