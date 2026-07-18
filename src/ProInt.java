import java.util.HashMap;
import java.util.LinkedList;

public class ProInt {

    LinkedList<Integer> removeDupli(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedList<Integer> result = new LinkedList<>();

//        map.put(array[0], 1);
//        result.add(array[0]);


        for (int i = 1; i < array.length; i++) {
            if (map.containsKey(array[i])) {
                int temp = map.get(array[i]);
                map.put(array[i], temp + 1);
            } else {
                map.put(array[i], 1);
            }
        }


        for (int i = 0; i < map.size(); i++) {
            if (map.get(array[i]) == 1) {
                result.add(array[i]);
            }
        }

        return result;

    }
}
