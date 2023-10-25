class Solution
{
   
    String modify(String S)
    {
        // your code here
        return S.replaceAll("\\s","");
    }
}

//Orrrr
String modify(String S){
        int i=0;
        StringBuilder ans = new StringBuilder();
        while(i<S.length()){
            if(S.charAt(i)!=' ') ans.append(S.charAt(i));
            i++;
        }
        return ans.toString();
    }
