public class Problem88 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length - 1;
        int k = 0;

        for (int i = 0; i <= length; i++) {
            if (nums[i] == val) {
                nums[i] = nums[length];
                nums[length] = val;
                length--;
                i--;
            }else {
                k++;
            }
        }

        return k;
    }



}
