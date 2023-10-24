class GfG
{
    int maxLen(int arr[], int n)
    {
        // Your code here
        int max = 0;
        Map<Integer,Integer> mp = new HashMap<>();
        mp.put(arr[0],0);
        for(int i = 1;i < n;i++)
        {
            arr[i] = arr[i]+arr[i-1];
            if(mp.containsKey(arr[i])) continue;
            else
            mp.put(arr[i],i);
        }
        for(int i = 0;i < n;i++)
        {
            if(arr[i]==0)
            {
                max = Math.max(max,i+1);
            }
            max = Math.max(max,i-mp.get(arr[i]));
        }
        return max;
    }
}
