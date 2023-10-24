class Solution {
    int getOddOccurrence(int[] arr, int n) {
        // code here
        int ctr = 0;
        for(int i = 0;i < n;i++)
        {
            ctr=ctr^arr[i];
        }
        return ctr;
    }
}
