import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Pro380 {
    //    HashSet<Integer> values;
    ArrayList<Integer> values;

    public Pro380() {
        values = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (values.contains(val)) {
            values.add(val);
            return false;
        }
        values.add(val);
        return true;
//
//        if (values.add(val)){
//            return true;
//        }
//        return false;

    }

    public boolean remove(int val) {
        int index = values.indexOf(val);
        if (index == -1) {
            return false;
        }
        values.remove(index);
        return true;

//        if (values.remove(val)){
//            return true;
//        }
//
//        return false;
    }

    public int getRandom() {
//        ArrayList<Integer> list = new ArrayList<>(values);
        Random random = new Random();
        int randomNumber = random.nextInt(values.size());
        return values.get(randomNumber);
    }

}
