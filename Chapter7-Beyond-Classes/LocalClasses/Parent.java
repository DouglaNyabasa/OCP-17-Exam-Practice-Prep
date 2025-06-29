public class Parent {
   private String firstName = "Douglas";

   public void fullName(){

   final String secondName = "Nyabasa";
   class Child{
     public void  concat(){
      System.out.println(firstName+ " " +  secondName);
     }

   }
   var child = new Child();
   child.concat();

   }

   public static void main(String[] args){
   var parent = new Parent();
   parent.fullName();


   }
}
