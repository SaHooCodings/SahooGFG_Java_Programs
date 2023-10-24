//Divide and Conquer
class Solution {
    int binarysearch(int arr[], int n, int k) 
    {
        // code here
        return bin_search(arr,0,n-1,k);
    }
    int bin_search(int arr[], int left, int right, int k)
    {
        if(left>right) return -1;
        int mid = left+(right-left)/2;
        if(arr[mid]==k) return mid;
        else if(arr[mid]<k)  return bin_search(arr,mid+1,right,k);
        else return bin_search(arr,left,mid-1,k);
    }
}
