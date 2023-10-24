class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
        ArrayList<ArrayList<Integer>> li = new ArrayList<>();
        int sell = 0;
        int buy = 0;
        for(int i = 0;i < n-1;i++)
        {
            if(A[i+1]>A[i])
            {
                sell++;
            }
            else
            {
                if(sell>buy)
                {
                    ArrayList<Integer> l = new ArrayList<>();
                    l.add(buy);
                    l.add(sell);
                    li.add(l);
                }
                buy = i+1;
                sell = i+1;
            }
        }
        if(sell>buy)
        {
            ArrayList<Integer> l = new ArrayList<>();
            l.add(buy);
            l.add(sell);
            li.add(l);
        }
        return li;
    }
}
