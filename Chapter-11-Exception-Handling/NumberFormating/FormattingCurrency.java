import java.text.NumberFormat;
import java.util.Locale;

public class FormattingCurrency {
    public static void main(String[] args) {
        double amount =  23;
        var mylocal = NumberFormat.getCurrencyInstance();
        System.out.println(mylocal.format(amount));

        // for china

        System.out.println("==============for china ===============");
        var china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(china.format(amount));

        System.out.println("==============for Germany ===============");
        var germany = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(germany.format(amount));
    }
}

