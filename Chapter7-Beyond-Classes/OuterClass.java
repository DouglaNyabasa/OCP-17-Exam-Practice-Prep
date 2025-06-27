public class OuterClass{
	public void print(){
	System.out.println("hello from outer class");
	}
   static class Nested{
          public void print(){
	   System.out.println("hello from nested class");
	  }
   }

   public static void main(String [] args){
     
     Nested nested = new OuterClass.Nested();
     nested.print();
     OuterClass outer1 = new OuterClass();
     outer1.print();
	    
   }
}
