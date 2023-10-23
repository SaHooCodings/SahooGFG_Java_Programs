class Solution{
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
        TreeMap<Integer, Integer> tr1 = new TreeMap<>();
        TreeMap<Integer, Integer> tr2 = new TreeMap<>();
        TreeMap<Integer, Integer> tr3 = new TreeMap<>();
        for(int i = 0;i < v1.length;i++)
        {
            if(tr1.containsKey(v1[i]))
            {
                tr1.put(v1[i],tr1.get(v1[i])+1);
            }
            else
            {
                tr1.put(v1[i],1);
            }
        }
        for(int i = 0;i < v2.length;i++)
        {
            if(tr2.containsKey(v2[i]))
            {
                tr2.put(v2[i],tr2.get(v2[i])+1);
            }
            else
            {
                tr2.put(v2[i],1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : tr1.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if(tr2.containsKey(key))
            {
                tr3.put(key, Math.min(value, tr2.get(key)));
            }
        }
        ArrayList<Integer> li = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : tr3.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            for(int i = 0;i < value;i++)
            {
                li.add(key);
            }
        }
        return li;
    }
}
