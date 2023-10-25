class GfG
{
	boolean isBinary(String str)
	{
	  //Your code here
	  for(int i=0;i<str.length();i++){
	      char ch = str.charAt(i);
	      if(ch=='0' || ch=='1')
	      continue;
	      return false;
	  }
	  return true;
	}
}
