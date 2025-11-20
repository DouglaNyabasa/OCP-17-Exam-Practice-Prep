import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SampleFormats{

    public static void main(String[] args) {
        double d = 1234.567;
        NumberFormat f1 = new  DecimalFormat("###,###,###.#");
        NumberFormat f2 = new  DecimalFormat("#,###,###.#");
        NumberFormat f3 = new  DecimalFormat("#,###.#");
        NumberFormat f4 = new  DecimalFormat("#,###.#");
        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
        System.out.println(f3.format(d));
        System.out.println(f4.format(d));
    }
}


