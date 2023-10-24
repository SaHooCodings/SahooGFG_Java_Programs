class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        int sum = 0;
        int start = 0;
        int last = 0;
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            sum+=arr[i];
            if(sum>=s)
            {
                last = i;
                while(s<sum && start<last)
                {
                    sum-=arr[start];
                    start++;
                }
                if(sum==s)
                {
                    li.add(start+1);
                    li.add(last+1);
                    break;
                }
            }
        }
        if(sum!=s){
          li.add(-1);  
        } 
        return li;
    }
}
