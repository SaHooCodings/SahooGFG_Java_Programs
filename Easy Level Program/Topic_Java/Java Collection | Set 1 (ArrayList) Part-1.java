class Solution 
{ 
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q, ArrayList<Integer> Query) 
    { 
        // code here
        if (Q==1){
            A.add(Query.get(0), Query.get(1));
            return A;
        }
        ArrayList<Integer> res = new ArrayList<>();
        if(Q==2){
            res.add(A.lastIndexOf(Query.get(0)));
            return res;
        }
        res.add(-1);
        return res;
    }
}
