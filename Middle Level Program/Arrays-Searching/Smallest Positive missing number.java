class Solution
{
    //Function to find the smallest positive number missing from the array.
    static int missingNumber(int arr[], int size)
    {
        // Your code here
        int pivot = seperate(arr,size);
        
        return findMissing(arr,pivot,size);
    }
    static int seperate(int arr[], int n)
    {
        int j = 0;
        for(int i = 0;i < n;i++)
        {
            if(arr[i] <= 0)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }
    static int findMissing(int arr[], int pivot, int end)
    {
        for(int i = pivot;i < end;i++)
        {
            if(Math.abs(arr[i])+pivot-1 < end && arr[Math.abs(arr[i])+pivot-1] > 0)
            {
                arr[Math.abs(arr[i])+pivot-1] = (-1)*arr[Math.abs(arr[i])+pivot-1];
            }
        }
        for(int i = pivot;i < end;i++)
        {
            if(arr[i] > 0)
            {
                return i-pivot+1;
            }

        }
        return end-pivot+1;
    }
}
