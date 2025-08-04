import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorSort {

    private String character ;
    private Integer powerLevel ;

    @Override
    public String toString() {
        return "ComparableSort{" +
                "character='" + character + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }

    public ComparatorSort(String character, int powerLevel) {
        this.character = character;
        this.powerLevel = powerLevel;
    }



    public Integer getPowerLevel() {
        return powerLevel;
    }



    public static void main(String[] args) {
        Comparator<ComparatorSort> chars = new Comparator<ComparatorSort>(){
            @Override
            public int compare(ComparatorSort o1, ComparatorSort o2) {
                return o1.getPowerLevel() - o2.getPowerLevel();
            }


        };
        var comparatorSort = new ArrayList<ComparatorSort>();
        comparatorSort.add(new ComparatorSort("Goku", 100));
        comparatorSort.add(new ComparatorSort("Frieza", 110));
        comparatorSort.add(new ComparatorSort("Bull", 150));
        Collections.sort(comparatorSort, chars);
        for(ComparatorSort com : comparatorSort){
            System.out.println(com);
        }

    }
}

