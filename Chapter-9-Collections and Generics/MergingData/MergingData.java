import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class MergingData {

    public static void main(String[] args) {
        BiFunction<String,String,String> anime = (A1,A2) -> A1.length()>A2.length()?A1:A2;

        Map<String,String> animeShows = new HashMap<>();
        animeShows.put("one", "naruto");
        animeShows.put("two", "demon slayer");
        animeShows.put("three", "hunter-x-hunter");

        String mergedAnime = animeShows.merge("one","dragon ball z",anime);
        String mergedAnime2 = animeShows.merge("two","one piece",anime);
        String mergedAnime1 = animeShows.merge("three","my hero academia",anime);


        System.out.println(mergedAnime);
        System.out.println("===================================");
        System.out.println(mergedAnime1);
        System.out.println("===================================");
        System.out.println(mergedAnime2);
    }

}

