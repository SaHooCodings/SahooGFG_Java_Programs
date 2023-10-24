/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        //Write your code here
        long max=a[0],min=a[1];
        if(a[0]<a[1])
        {
            max = a[1];
            min = a[0];
        }
        for(int i = 0;i < n;i++)
        {
            if(a[i] > max)  max = a[i];
            else if(a[i] < min)  min = a[i];
        }
        Pair min_max = new Pair(min,max);
        return min_max;
    }
}
