class GFG {
    String longest(String names[], int n) {
        String s = "";
        for(int i = 0;i < n;i++)
        {
            if(names[i].length() > s.length())
            {
                s = names[i];
            }
        }
        return s;
    }
}
