import java.util.Locale;

public class InternationalizationAndLocalization {

    public static void main(String[] args) {
        Locale locale = Locale.getDefault();
        System.out.println(locale);
        System.out.println("===============First Approach using built in constants in Locale class ==================");
        System.out.println(Locale.CHINESE);
        System.out.println(Locale.CHINA);
        System.out.println("===============Second Approach using contractors to create a new object==================");
        System.out.println(new Locale("en", "US"));
        System.out.println("===============Third Approach using the builder ==================");
        Locale l1 = new Locale.Builder()
                .setRegion("US")
                .setLanguage("en")
                .build();
        System.out.println(l1);



    }
}

