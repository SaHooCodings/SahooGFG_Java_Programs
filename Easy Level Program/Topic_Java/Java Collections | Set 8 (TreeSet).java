class gfg1
{
    //Function to perform specific tasks with a TreeSet and four characters.
    void task(TreeSet<String> ts,char a,char b,char c,char d)
    {
        //Converting characters to strings.
        String A=String.valueOf(a);
        String B=String.valueOf(b);
        String C=String.valueOf(c);
        String D=String.valueOf(d);
        
        //Printing the subset of elements in the TreeSet that are less than A.
        System.out.println(ts.headSet(A));
        
        //Printing the subset of elements in the TreeSet that are greater than or equal to B.
        System.out.println(ts.tailSet(B));
        
        //Printing the subset of elements in the TreeSet that are greater than C and less than D.
        System.out.println(ts.subSet(C,D));
    }
}
