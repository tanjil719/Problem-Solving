import java.util.Arrays;

public class Pro209 {
    public int minSubArrayLen(int target, int[] nums) {

        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // While the condition is met, try to shrink the window
            while (sum >= target) {
                minLength = Math.min(minLength, right - left + 1);

                // Shrink from the left
                sum -= nums[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

}
