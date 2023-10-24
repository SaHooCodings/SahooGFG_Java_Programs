class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Arrays.sort(arr);
        for(int i = 0;i < n;i++)
        {
            int l = i+1;
            int h = n-1;
            int x = arr[i];
            while(l<h)
            {
                if(x+arr[l]+arr[h]==0)
                return true;
                else if(x+arr[l]+arr[h]<=0)
                l++;
                else
                h--;
            }
        }
        return false;
    }
}
