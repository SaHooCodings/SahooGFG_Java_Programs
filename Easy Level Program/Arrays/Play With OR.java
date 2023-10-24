class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        for(int i = 0;i < n;i++)
        {
            int j = i+1;
            if(j < n)
            {
            arr[i] = arr[i] | arr[j];
            }
        }
        return arr;
    }
}
