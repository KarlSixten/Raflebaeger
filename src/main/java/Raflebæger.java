import java.util.ArrayList;
import java.util.Random;
public class Raflebæger {
    Random random = new Random();
    
    //Attributes
    private int numberOfDice;
    private ArrayList<Integer> terninger = new ArrayList<>();

    //Constructor
    public Raflebæger(int numberOfDice) {
        this.numberOfDice = numberOfDice;
        for (int i = 0 ; i < numberOfDice ; i++) {
            terninger.add(i, random.nextInt(1, 7));
        }
    }

    //Methods
    public int ryst() {
        int sum = 0;
        for (int i = 0 ; i < numberOfDice ; i++) {
            terninger.set(i, random.nextInt(1, 7));
            sum += terninger.get(i);
        }
        return sum;
    }

    public ArrayList<Integer> se() {
        return terninger;
    }
}
