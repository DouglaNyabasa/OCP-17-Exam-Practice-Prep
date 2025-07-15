import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<String> supplier = ()-> "hello Goku";
        System.out.println(supplier.get());
    }

}

