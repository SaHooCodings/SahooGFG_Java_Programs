class GfG
{
    public static int findMax(Height arr[], int n)
    {
       // your code here
       int maxi = Integer.MIN_VALUE;
       for(int i = 0;i < n;i++)
       {
           arr[i].inches = arr[i].feet*12 + arr[i].inches;
           if(arr[i].inches > maxi)
           {
               maxi = arr[i].inches;
           }
       }
       return maxi;
    }
    
}
