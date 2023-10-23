class Solution 
{
    ArrayList<Integer> valueEqualToIndex(int arr[], int n)
    {
        // code here
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            if(arr[i] == i+1)
            {
                li.add(arr[i]);
            }
        }
        return li;
    }
}
