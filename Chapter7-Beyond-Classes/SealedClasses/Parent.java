public sealed class Parent permits Daughter,Son {
    String name = "Douglas";

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.print();
        Son son = new Son();
        son.print();


    }

}
