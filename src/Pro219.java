import java.util.HashMap;

public class Pro219 {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> elementIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int element = nums[i];

            if (elementIndexMap.containsKey(element) && i - elementIndexMap.get(element) <= k) {
                return true;
            }

            elementIndexMap.put(element, i);
        }

        return false;

    }

}
