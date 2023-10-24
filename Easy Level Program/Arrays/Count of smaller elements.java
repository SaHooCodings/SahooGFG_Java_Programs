class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        int ctr = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i]<=x) ctr++;
        }
        return ctr;
    }
}
