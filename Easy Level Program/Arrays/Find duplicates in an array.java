class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        for(int i = 0;i < n;i++)
        {
            int index = arr[i]%n;
            arr[index] += n;
        }
        ArrayList<Integer>li = new ArrayList<>();
        int flag = 0;
        for(int i = 0;i < n;i++)
        {
            if((arr[i]/n) > 1)
            {
                li.add(i);
                flag = 1;
            }
        }
        if(flag == 0) li.add(-1);
        return li;
    }
}
