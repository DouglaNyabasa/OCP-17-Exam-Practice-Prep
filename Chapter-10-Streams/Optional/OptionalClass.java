import java.util.Optional;

public class OptionalClass {
    public static Optional<Double> average(int... scores){
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }
    public static Optional<Double> average1(int... scores){
        if (scores.length == 0) return Optional.empty();
        int sum = 0;
        for (int score: scores) sum += score;
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {

        Optional<Double> opt = average(100,300);
        opt.ifPresent(System.out::println);
        Optional<Double> opt1 = average1();
        if (opt1.isPresent()) System.out.println(opt1.get());
        System.out.println(opt1.orElse(null));
        System.out.println(opt1.orElseGet(()->Math.random()));
        System.out.println(opt1.orElseThrow());

    }
}

