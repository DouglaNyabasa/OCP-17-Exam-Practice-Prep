import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SampleFormats3{

    public static void main(String[] args) {
        double d = 1234.567;
        NumberFormat f1 = new DecimalFormat("000,000,000.00000");
        NumberFormat f2 = new DecimalFormat("000,000,000.#");
        NumberFormat f3 = new DecimalFormat("000,000,000.0");
        NumberFormat f4 = new DecimalFormat("Your Balance $#,###,###.##");


        System.out.println(f1.format(d));
        System.out.println(f2.format(d));
        System.out.println(f3.format(d));
        System.out.println(f4.format(d));

    }
}

