import java.util.Arrays;

public class Problem169 {

    public int majorityElement(int[] nums) {
        int count = 1, tempCount = 1, majority = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                tempCount++;
            }
            if (nums[i] != nums[i - 1]) {
                tempCount = 1;
            }

            if (tempCount > count) {
                count = tempCount;
                majority = nums[i];
            }
        }

        return majority;

//        Arrays.sort(nums);
//        int n = nums.length;
//        return nums[n/2];

    }

}




