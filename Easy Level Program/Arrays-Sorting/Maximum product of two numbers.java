class Solution {
    int maxProduct(int arr[], int n) {
        // code here
        int first = -1;
        int second = -1;
        for(int i = 0;i < n;i++)
        {
            if(first <= arr[i])
            {
                second = first;
                first = arr[i];
            }
            else if(second <= arr[i])
            {
                second = arr[i];
            }
        }
        return first*second;
    }
}
