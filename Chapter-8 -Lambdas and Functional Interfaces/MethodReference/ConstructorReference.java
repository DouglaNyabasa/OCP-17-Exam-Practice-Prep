import java.util.function.Supplier;

public class ConstructorReference{

   public ConstructorReference(){
     System.out.println("calling GOKU from constructor");
   }

   public static void main(String[] args){
   
    Supplier<ConstructorReference> supplier = ConstructorReference::new;
    supplier.get();
   }
}
