public class OuterClass {


    
    // Constructor
    public OuterClass() {}

    // Private method in the outer class
    private void numb() {
        System.out.println("A private method which belongs to the outer class is also accessible in the static nested class.");
    }

    // Public method in the outer class
    public void print() {
        System.out.println("Hello from outer class");
    }

    // Static nested class
    static class Nested {


        // Method to access the outer class's private method
        public void printPrivateMethod(OuterClass outer) {
            outer.numb(); // Accessing the outer class's private method
        }

        // Public method in the nested class
        public void print() {
            System.out.println("Hello from nested class");
        }
    }

    // Main method
    public static void main(String[] args) {
        OuterClass outer1 = new OuterClass(); // Create an instance of OuterClass
        Nested nested = new OuterClass.Nested(); // Create an instance of Nested
       
        nested.print(); // Call nested class's method
        nested.printPrivateMethod(outer1); // Call to access the outer class's private method
        outer1.print(); // Call outer class's method
    }
}

