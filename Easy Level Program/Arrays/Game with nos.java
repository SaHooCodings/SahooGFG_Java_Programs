class Complete{
    public static int[] game_with_number (int arr[], int n) {
        for(int d=0;d < n-1;d++)
        {
            arr[d] = arr[d]^arr[d+1];
        }
        return arr;
    }
}
