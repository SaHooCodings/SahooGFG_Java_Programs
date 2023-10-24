class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        //code here.
        int start = -1;
        for(int i = 0;i < N;i++)
        {
            if(key == a[i])
            {
                start = i;
                break;
            }
        }
        int end = start;
        for(int i = N-1;i >= 0;i--)
        {
            if(key == a[i])
            {
                end = i;
                break;
            }
        }
        int b[] = new int[2];
        b[0] = start;
        b[1] = end;
        return b;
    }
}
