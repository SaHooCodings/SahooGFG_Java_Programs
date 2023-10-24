class Solution {
    int[] constructLowerArray(int[] arr, int n) {
        // code here
        int ctr[] = new int[n];
        int x = n-2;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        for(int i = n-2;i >= 0;i--)
        {
            int index = idx(list,arr[i],0,list.size()-1);
            list.add(index,arr[i]);
            ctr[x] = index;
            x--;
        }
        return ctr;
    }
    int idx(ArrayList<Integer>li, int ele, int low, int high)
    {
        while(low <= high)
        {
            int mid = low+(high-low)/2;
            if(li.get(mid) >= ele)
            {
                return idx(li,ele,low,mid-1);
            }
            else
            {
                return idx(li,ele,mid+1,high);
            }
        }
        return low;
    }
}
