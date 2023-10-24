//Hash
class Solution{
    //Function to check if two arrays are equal or not.
    public static boolean check(long A[],long B[],int N)
    {
        //Your code here
        HashMap<Long,Long> hm = new HashMap<>();
        for(int i = 0;i < N;i++)
        {
            long num = A[i];
            if(hm.containsKey(num))
            {
                long freq = hm.get(num);
                freq++;
                hm.put(num,freq);
            }
            else
            {
                hm.put(num,(long)1);
            }
        }
        for(int i = 0;i < N;i++)
        {
            long num = B[i];
            if(hm.containsKey(num))
            {
                long freq = hm.get(num);
                freq--;
                hm.put(num,freq);
            }
        }
        for(Map.Entry<Long,Long> entry:hm.entrySet())
        {
            if(entry.getValue()!=0) return false;
        }
        return true;
    }
}
