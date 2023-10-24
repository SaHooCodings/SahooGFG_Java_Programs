class Solution {
    public pair[] allPairs( long A[], long B[], long N, long M, long X) {
        // Your code goes here 
        Arrays.sort(A);
        Set<Long> s = new HashSet<>();
        ArrayList<pair> li = new ArrayList<>();
        for(long i : B)
        {
            s.add(i);
        }
        for(long i : A)
        {
            if(s.contains(X-i))
            {
                pair p = new pair(i,X-i);
                li.add(p);
            }
        }
        int k = 0;
        pair[] ans = new pair[li.size()];
        for(pair j : li)
        {
            ans[k++] = j;
        }
        return ans;
    }
}
