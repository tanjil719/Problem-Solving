import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Pro219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        //Using HashMap For solution

//        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            int element = nums[i];
//
//            if (elementIndexMap.containsKey(element) && i - elementIndexMap.get(element) <= k) {
//                return true;
//            }
//
//            elementIndexMap.put(element, i);
//        }
//
//        return false;


        //Using Sliding Window For solution

        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;

    }

}
