public class NestedClass {
    public int x = 20; // Field in the outer class

    // Inner class
    public class Inner {
        // Constructor for Inner class
        public Inner() {
            System.out.println(x); // Accessing the outer class's field
        }
    }

    public static void main(String[] args) {
        NestedClass outer = new NestedClass(); // Create an instance of the outer class
        Inner inner = outer.new Inner(); // Create an instance of the inner class
    }
}

