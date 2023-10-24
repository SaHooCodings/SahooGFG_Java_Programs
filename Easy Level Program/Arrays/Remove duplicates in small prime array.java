class Solution
{
    ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here 
        int[] dp = new int[100];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            if(dp[arr[i]]==0)
            {
                dp[arr[i]]=1;
                list.add(arr[i]);
            }
        }
        return list;
    }
}
