class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        // Complete the function
        ArrayList<Integer> li = new ArrayList<>();
        int sum = 0;
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(i == j)
                {
                    sum += a[i][i];
                }
            }
        }
        li.add(sum);
        int max = 0;
        for(int i = 0;i < n;i++)
        {
            if(max < b[i])
            {
                max = b[i];
            }
        }
        li.add(max);
        return li;
    }
}
