class Solution{
    public String chartostr(char arr[], int N){
        //String s = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < N;i++)
        {
          //s+=arr[i];
          sb.append(arr[i]);
        }
        return sb.toString();
    }
}
