class Solution {
    
    public long totalFine( long n, long date, long car[], long fine[])
    {
        long even = 0, odd = 0;
        for(int i = 0;i < n;i++)
        {
            if(car[i] % 2 == 0)
            {
                even+=fine[i];
            }
            else
            {
                odd+=fine[i];
            }
        }
        if(date % 2 == 0)
        {
            return odd;
        }
        return even;
    }
}
