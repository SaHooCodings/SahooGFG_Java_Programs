class testClass implements in1
{
    public void display(int k)
    {   
        // Add your code here.
        int ctr=0;
        boolean flag = false;
        for(int i = 2;i<=k;i++){
            flag = false;
            for(int j = 2;j<i;j++){
                if(i%j==0){
                    flag = true;
                    break;
                }
            }
            if(!flag)
                ctr++;
        }
        System.out.println(ctr);
    }
}
