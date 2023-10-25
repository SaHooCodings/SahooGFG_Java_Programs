class Solution
{
    //Function to check if a string is Isogram or not.
    static boolean isIsogram(String data){
        //Your code here
        ArrayList<Character> list = new ArrayList<>();
        char[] ch = data.toCharArray();
        for(int i = 0;i < data.length();i++)
        {
            if(list.contains(ch[i]))
            {
                return false;
            }
            else
            {
                list.add(ch[i]);
            }
        }
        return true;
    }
}
