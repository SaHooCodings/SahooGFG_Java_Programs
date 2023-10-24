class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int first, second;
        first = second = Integer.MIN_VALUE;
        for(int i = 0;i < n;i++)
        {
            if(first < arr[i])
            {
                second = first;
                first = arr[i];
            }
            else if(second < arr[i] && arr[i]!=first)
            {
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE) return -1;
        
        return second;
    }
}
