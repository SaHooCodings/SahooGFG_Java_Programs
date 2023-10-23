public class GenericClass<T> {
    
    //Add your code here. Make a private data variable, constructor which intialize 
    // the data variable and a method showType().
 private T value;
 
    public GenericClass(T value)
    {
        this.value = value;
    }
 
    public void showType()
    {
        System.out.println(value.getClass().getSimpleName());
        System.out.println(value);
    }
}
