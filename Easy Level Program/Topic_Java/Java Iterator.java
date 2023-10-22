class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < n;i++){
            list.add(arr[i]);
        }
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next()<k){
                it.remove();
            }
        }
        Collections.sort(list);
        return list;
    }
};
