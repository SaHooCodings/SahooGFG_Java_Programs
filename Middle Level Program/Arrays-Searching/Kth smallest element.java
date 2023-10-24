class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        if(k>0 && k<=r-l+1)
        {
            int pos = randomPartition(arr, l, r);
            
            if(pos-l == k-1)
            {
                return arr[pos];
            }
            if(pos-l < k-1)
            {
                return kthSmallest(arr,pos+1,r,k-pos+l-1);
            }
            else
            {
                return kthSmallest(arr,l,pos-1,k);
            }
        }
        return Integer.MAX_VALUE;
    }
    static int randomPartition(int[] arr, int l, int r)
    {
        int n = r-l+1;
        Random rd = new Random();
        int pivot = rd.nextInt(n);
        swap(arr,l+pivot,r);
        return partition(arr,l,r);
    }
    static void swap(int arr[], int l, int r)
    {
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static int partition(int arr[], int l, int r)
    {
        int x = arr[r]; 
        int j = l;
        for(int i = l;i < r;i++)
        {
            if(arr[i] <= x)
            {
                swap(arr,i,j);
                j++;
            }
        }
        swap(arr,j,r);
        return j;
    }
}
