class Solution
{
    //Function to sort the binary array.
    static void binSort(int A[], int N)
    {
        // add your code here
        int l = 0;
        int h = N-1;
        /**************
        * No need to print the array
        * ************/
        while(l<h)
        {
            if(A[l]==0)
            {
                l++;
            }
            else if(A[h]==1)
            {
                h--;
            }
            else
            {
                int temp = A[l];
                A[l] = A[h];
                A[h] = temp;
            }
        }
    }
}
