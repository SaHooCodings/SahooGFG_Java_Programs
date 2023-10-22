class TestClass {
    int a, b, Min;

    TestClass(){}; // Default constructor

    TestClass(int x, int y) { // Parameterized constructor
        this.a = x;
        this.b = y;
        this.Min = Integer.MAX_VALUE; // Setting initial value of Min to maximum possible value
    }

    public void findMin() {
        Min = Math.min(Min, a + b); // Finding minimum of current Min and sum of a and b
        Min = Math.min(Min, a - b); // Finding minimum of current Min and difference of a and b
        Min = Math.min(Min, a * b); // Finding minimum of current Min and product of a and b

        try { // Trying to divide a by b
            Min = Math.min(Min, a / b); // Finding minimum of current Min and division of a by b
        } catch (Exception e) {
            // Catching and ignoring any exception if it occurs during division
        } finally { // Executed regardless of whether an exception occurred or not
            System.out.println(Min); // Printing the final value of Min
        }
    }
}
