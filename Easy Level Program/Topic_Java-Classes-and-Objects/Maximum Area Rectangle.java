class maxArea{
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max = Integer.MIN_VALUE;
        int area = 0;
        for(int i = 0;i < arr.length;i++)
        {
            area = arr[i].length*arr[i].breadth;
            if(area > max)
            {
                max = area;
            }
        }
        return max;
    }
    
}
