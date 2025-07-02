public class Outer {
    private int instanceVar = 10; // Private instance variable
    public static int staticVar = 20; // Static variable

    // Static nested class
    static class StaticNestedClass {
        void display() {
            // Cannot access instanceVar directly
            // System.out.println(instanceVar); // This would cause a compilation error

            // Can access staticVar directly
            System.out.println("Static variable from outer class: " + staticVar);
        }
    }

    public void accessNested() {
        // Create an instance of the static nested class
        StaticNestedClass nested = new StaticNestedClass();
        nested.display();
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.accessNested();
    }
}

