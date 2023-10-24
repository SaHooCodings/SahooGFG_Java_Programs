class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long,Long> s = new HashMap<>();
        for(long i : a1)
        {
            s.put(i,s.getOrDefault(i,0L)+1);
        }
        for(long i : a2)
        {
            if(!s.containsKey(i)||s.get(i)==0)
            {
                return "No";
            }
            s.put(i,s.get(i)-1);
        }
        return "Yes";
    }
}
