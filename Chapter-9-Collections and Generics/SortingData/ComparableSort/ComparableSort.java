import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparableSort implements Comparable<ComparableSort> {

    private String character ;
    private Integer powerLevel ;

    @Override
    public String toString() {
        return "ComparableSort{" +
                "character='" + character + '\'' +
                ", powerLevel=" + powerLevel +
                '}';
    }

    public ComparableSort(String character, int powerLevel) {
        this.character = character;
        this.powerLevel = powerLevel;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    public Integer getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(Integer powerLevel) {
        this.powerLevel = powerLevel;
    }
    @Override
    public int compareTo(ComparableSort o) {
        return powerLevel.compareTo(o.powerLevel);
    }

    public static void main(String[] args) {
        var chars = new ArrayList<ComparableSort>();
        chars.add(new ComparableSort("Goku", 100));
        chars.add(new ComparableSort("Naruto Serge Mode", 110));
        chars.add(new ComparableSort("Minaro", 180));
        chars.add(new ComparableSort("Itachi", 90));
        System.out.println(chars);
        System.out.println("=========================");
        Collections.sort(chars);
        for(ComparableSort c: chars) {
            System.out.println(c);
        }

    }


}

