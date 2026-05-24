import java.util.ArrayList;
import java.util.List;

public class Pro228 {

    public List<String> summaryRanges(int[] nums) {

        if (nums.length == 0) {
            return new ArrayList<>();
        }

        List<String> result = new ArrayList<>();
        int start = 0, end = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1] + 1) {
                end++;
            } else {
                if (start == end) {
                    result.add(String.valueOf(nums[start]));
                } else {
                    result.add(nums[start] + "->" + nums[end]);
                }
                start = end = i;
            }
        }

        if (start == end) {
            result.add(String.valueOf(nums[start]));
        } else {
            result.add(nums[start] + "->" + nums[end]);
        }

        return result;
    }

}
