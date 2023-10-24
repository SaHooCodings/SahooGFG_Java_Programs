class Compute {
    
    // Method to rotate the array
    public void rotate(int arr[], int n)
    {
        // Store the last element of the array
        int x = arr[arr.length-1], i;
        
        // Shift each element to the right
        for (i = n-1; i > 0; i--){
           arr[i] = arr[i-1];
        }
        
        // Place the stored element at the beginning of the array
        arr[0] = x;
    }
}
