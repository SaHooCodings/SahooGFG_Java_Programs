class Solution{
	void toBinary(int N) {
    // your code here
    String s = "";
    
    while(N>=1)
    {
        int x = N%2;
        N/=2;
        s = x+s;
    }
    System.out.print(s);
  }
}
