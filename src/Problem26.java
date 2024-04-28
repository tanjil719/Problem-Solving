import java.util.ArrayList;
import java.util.Arrays;

public class Problem26 {

    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] nums1 = nums.clone();
        result.add(nums[0]);
        for (int i =0; i< nums.length; i++){
            if (!(result.contains(nums1[i]))){
                result.add(nums[i]);
                nums[i] = nums1[i];
            }
            else {

            }
        }

        return 0;
    }

}
