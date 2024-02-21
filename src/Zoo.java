import java.util.ArrayList;

public class Zoo {

    ArrayList<Cage> cages = new ArrayList<>();

    public Zoo(int cageCount) {

        for (int i = 0; i < cageCount; i++) {

            cages.add(new Cage());

        }

    }

}
