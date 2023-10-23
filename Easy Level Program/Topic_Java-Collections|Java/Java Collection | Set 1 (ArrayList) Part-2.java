class GfG{
	void add_to_ArrayList(ArrayList<Integer> A, int x){
		//adding element x to the ArrayList A
		A.add(x);
	}	
	
	void sort_ArrayList_Asc(ArrayList<Integer> A){
		//sorting the ArrayList A in ascending order
		Collections.sort(A);
	}
	
	void reverse_ArrayList(ArrayList<Integer> A){
		//reversing the order of elements in ArrayList A
		Collections.reverse(A);
	}
	
	int size_Of_ArrayList(ArrayList<Integer> A){
		//returning the size of ArrayList A
		return A.size();
	}
	
	void sort_ArrayList_Desc(ArrayList<Integer> A){
		//sorting the ArrayList A in descending order
		Collections.sort(A, Collections.reverseOrder());
	}
	
	void print_ArrayList(ArrayList<Integer> A){
		//printing the elements of ArrayList A
		for(Integer i : A)
			System.out.print(i+" ");
	}
}
