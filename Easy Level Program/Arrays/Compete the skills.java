class Solution {

    public void scores(long a[], long b[]) {
        // store the answer as
        GFG.ca=0;
        GFG.cb=0;
        // Your code goes here
        int min = Math.min(a.length, b.length);
        for(int i = 0;i < min;i++)
        {
            if(a[i]>b[i]) GFG.ca++;
            if(a[i]<b[i]) GFG.cb++;
        }
    }
}
