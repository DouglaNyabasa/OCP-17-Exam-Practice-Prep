// demonstration of a Compact constructor 

public record Anime(String name, int watched){

    public Anime{
        if(watched <1) throw new IllegalArgumentException();
        name = name;
        

    }
    public static void main(String[] args){

        var anime = new Anime("naruto",2);
        var anime1 = new Anime("naruto",2);
        var anime2 = new Anime("bleach",1);

        System.out.println(anime.equals(anime1));
        System.out.println(anime.hashCode() + " , " + anime1.hashCode());
        System.out.println(anime.equals(anime2));


    }
}

