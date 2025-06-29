public  class Parent{
    abstract class Child{

        abstract String name();
    }

    public void print(String input){

        // HAS TO EXTEND A CLASS OR IMPLEMENT AN INTERFACE
        Child child = new Child(){
            String name(){
               return  " " + "DOUGLAS";
            }
        };
        System.out.println(input + child.name());
    }

    public static void main(String[] args){
        Parent parent = new Parent();
        parent.print("hello");

    }

}
