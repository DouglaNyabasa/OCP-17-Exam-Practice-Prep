import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

    public static void animeShows(List<?> shows){
          for (Object show : shows) {
              System.out.println(show);
          }
    }

    public static void main(String[] args) {
        ArrayList<String> anime = new ArrayList<>();
       anime.add("naruto");
       anime.add("bungo stray dogs");

        animeShows(anime);       
    }
}

