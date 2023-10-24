class GfG
{		
	public boolean searchEle(int a[],int x)
       {
		//add code here.
	    for(int i = 0;i < a.length;i++)
	    {
	        if(a[i] == x) return true;
	    }
	    return false;
	}
	public boolean insertEle(int a[],int y,int yi)
        {
              //add code here.
              a[yi] = y;
              return true;
	}
	public boolean deleteEle(int a[],int z)
        {
		//add code here.
		int temp = 0;
		for(int i = 0;i < a.length;i++)
		{
		    if(a[i]==z) temp = 1;
		}
		return true;
	}
}
