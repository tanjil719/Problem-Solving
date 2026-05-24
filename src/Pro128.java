import java.util.Arrays;

public class Pro128 {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int maxLength = 1, current = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i - 1] == nums[i]) {
                continue;
            }

            if (nums[i - 1] + 1 == nums[i]) {
                current++;
            } else {
                maxLength = Math.max(maxLength, current);
                current = 1;
            }
        }

        return Math.max(maxLength, current);
    }
}
