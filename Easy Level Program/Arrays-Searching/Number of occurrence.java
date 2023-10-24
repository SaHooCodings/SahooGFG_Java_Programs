class Solution {
    int count(int[] arr, int n, int x)
    {
        // code here
        int first = firstOccur(arr, n ,x);
        int last = lastOccur(arr, n, x);
        if(first == -1 && last == -1) return 0;
        return last - first + 1;
	}
	int firstOccur(int arr[], int n, int x)
	{
	    int left = 0;
	    int right = n-1;
	    int result = -1;
	    while(left <= right)
	    {
	        int mid = (left+right)/2;
	        if(arr[mid] == x)
	        {
	            result = mid;
	            right = mid-1;
	        }
	        else if(arr[mid] < x)
	        {
	            left = mid+1;
	        }
	        else
	        {
	            right = mid-1;
	        }
	    }
	    return result;
	}
	int lastOccur(int arr[], int n, int x)
	{
	    int left = 0;
	    int right = n-1;
	    int result = -1;
	    while(left <= right)
	    {
	        int mid = (left+right)/2;
	        if(arr[mid] == x)
	        {
	            result = mid;
	            left = mid+1;
	        }
	        else if(arr[mid] < x)
	        {
	            left = mid+1;
	        }
	        else
	        {
	            right = mid - 1;
	        }
	    }
	    return result;
	}
}
