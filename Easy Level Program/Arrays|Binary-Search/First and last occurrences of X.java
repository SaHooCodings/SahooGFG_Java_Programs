class Solution{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        ArrayList<Integer> li = new ArrayList<>();
        int first = firstO(arr,n,x);
        int last = lastO(arr,n,x);
        if(first == -1 || last == -1)
        {
            li.add(-1);
            return li;
        }
        li.add(first);
        li.add(last);
        return li;
    }
    int firstO(int arr[], int n, int k)
    {
        int l = 0;
        int r = n-1;
        int res = -1;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] == k)
            {
                res = mid;
                r = mid - 1;
            }
            else if(arr[mid] < k)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return res;
    }
    int lastO(int arr[], int n, int k)
    {
        int l = 0;
        int r = n-1;
        int res = -1;
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(arr[mid] == k)
            {
                res = mid;
                l = mid+1;
            }
            else if(arr[mid] < k)
            {
                l = mid+1;
            }
            else
            {
                r = mid-1;
            }
        }
        return res;
    }
}
