import java.util.HashMap;

public class Pro1 {

    public int[] twoSum(int[] nums, int target) {

//        HashMap<Integer, Integer> elementCount = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//           int middle = target - nums[i];
//            if (elementCount.containsKey(middle) && elementCount.get(middle) != i) {
//                return new int[]{i, elementCount.get(middle)};
//            }
//            elementCount.put(nums[i], i);
//        }
//
//        return new int[]{};

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j + i < nums.length; j++) {
                if (nums[j] == target - nums[j + i]) {
                    return new int[]{j, j + i};
                }
            }
        }
        return new int[]{0, 0};
    }


}


