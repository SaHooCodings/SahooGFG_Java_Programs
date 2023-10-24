class Solution
{
    
    public void sortIt(long arr[], long n)
    {
        //code here.
        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> odd = new ArrayList<>();
        
        for(int i = 0;i < n;i++)
        {
            if(arr[i]%2 == 0)
            {
                even.add(arr[i]);
            }
            else
            {
                odd.add(arr[i]);
            }
        }
        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(odd);
        
        odd.addAll(even);
        for(int i = 0;i < odd.size();i++)
        {
            arr[i] = odd.get(i);
        }
    }
}
