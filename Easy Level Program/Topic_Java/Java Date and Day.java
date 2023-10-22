class Solution{
    static String findDay(int Day, int Month, int Year){
        //Code Here
        Calendar c = Calendar.getInstance();
        c.set(Year,Month-1,Day);
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"SUNDAY");
        map.put(2,"MONDAY");
        map.put(3,"TUESDAY");
        map.put(4,"WEDNESDAY");
        map.put(5,"THURSDAY");
        map.put(6,"FRIDAY");
        map.put(7,"SATURDAY");
        return map.get(c.get(Calendar.DAY_OF_WEEK));
    }
}
