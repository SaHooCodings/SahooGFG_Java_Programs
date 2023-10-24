class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        int low = 0,r = n-1;
        int mid = 0;
        while(mid<=r)
        {
            if(a[mid]==0)
            {
                int temp = a[mid];
                a[mid] = a[low];
                a[low] = temp;
                low++;
                mid++;
            }
            else if(a[mid]==1)
            {
                mid++;
            }
            else
            {
                int temp = a[mid];
                a[mid] = a[r];
                a[r] = temp;
                r--;
            }
        }
    }
}
