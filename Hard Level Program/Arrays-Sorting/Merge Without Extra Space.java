class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int l = n+m;
        int gap = (l/2)+(l%2);
        while(gap > 0)
        {
            int start = 0; int end = start+gap;
            while(end < l)
            {
                if(start < n && end >= n)
                {
                    swap(arr1, arr2, start, end-n);
                }
                else if(start >= n)
                {
                    swap(arr2, arr2, start-n, end-n);
                }
                else
                {
                    swap(arr1, arr1, start, end);
                }
                start++; end++;
            }
            if(gap == 1) break;
            gap = (gap/2)+(gap%2);
        }
    }
    static void swap(long arr1[], long arr2[], int i, int j)
    {
        if(arr1[i] > arr2[j])
        {
        long temp = arr1[i];
        arr1[i] = arr2[j];
        arr2[j] = temp;
        }
    }
}
