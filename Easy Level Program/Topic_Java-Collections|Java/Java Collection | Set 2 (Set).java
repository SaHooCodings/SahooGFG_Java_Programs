class GfG {
    // method to insert an element into the set
    void insert(Set<Integer> s, int x) {
        s.add(x);
    }

    // method to print the contents of the set
    void print_contents(Set<Integer> s) {
        TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
        myTreeSet.addAll(s);
        
        // iterating over the set and printing each element
        Iterator itr = myTreeSet.iterator();
        while(itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element + " ");
        }
    }

    // method to erase an element from the set
    void erase(Set<Integer> s, int x) {
        if(s.contains(x)) {
            for(Iterator<Integer> itr = s.iterator(); itr.hasNext();) {
                Integer element = itr.next();
                
                // removing the element if it matches the given value
                if(element == x)
                    itr.remove();
            }
        }
    }

    // method to get the size of the set
    int size(Set<Integer> s) {
        return s.size();
    }

    // method to find an element in the set
    int find(Set<Integer> s, int x) {
        Iterator itr = s.iterator();
        
        // checking if the set contains the given element and returning the result
        if(s.contains(x))
            return 1;
        else 
            return -1;
    }
}
