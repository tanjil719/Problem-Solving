import java.util.Arrays;

public class Pro238 {
    public int[] productExceptSelf(int[] nums) {
//        int[] left = new int[nums.length];
//        left[0] = 1;
//        int[] right = new int[nums.length];
//        right[right.length - 1] = 1;
//        int[] result = new int[nums.length];
//
//        for (int i = 1; i < left.length; i++) {
//            left[i] = left[i - 1] * nums[i - 1];
//        }
//
//        for (int i = right.length - 2; i >= 0; i--) {
//                 right[i] = right[i + 1] * nums[i + 1];
//        }
//
//        for (int i=0; i<nums.length; i++){
//            result[i] = left[i] * right[i];
//        }
//
//        return result;

        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int left = 1, right = 1;
        for (int i = 1; i< nums.length; i++) {
            result[i] = left * nums[i-1];
            left *= nums[i-1];
        }

        for (int i = result.length-1; i>=0; i--){
            result[i] = right * result[i];
            right *= nums[i];
        }

        return result;
    }
}
