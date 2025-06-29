public class Nested {
    private int x = 20; // Field in the outer class

    // Inner class
    public class Inner {
        // Constructor for Inner class
        public Inner() {
            System.out.println(x); // Accessing the outer class's field
        }
    }

    public static void main(String[] args) {
        Nested outer = new Nested(); // Create an instance of the outer class
        Inner inner = outer.new Inner(); // Create an instance of the inner class
    }
}

