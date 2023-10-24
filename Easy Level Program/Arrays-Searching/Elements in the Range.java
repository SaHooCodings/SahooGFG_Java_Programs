class Solution
{
    boolean check_elements(int arr[], int n, int A, int B)
    {   
        int range = B-A;
        
        for(int i = 0;i < n;i++)
        {
            if(Math.abs(arr[i])>=A && Math.abs(arr[i])<=B)
            {
                int z = Math.abs(arr[i])-A;
                if(z<n&&arr[z]>0)
                {
                    arr[z] = arr[z]*-1;
                }
            }
        }
        int ctr = 0;
        for(int i = 0;i <= range && i<n;i++)
        {
            if(arr[i]>0) return false;
            else
            ctr++;
        }
        if(ctr!=(range+1))
        return false;
        return true;
    }
}
