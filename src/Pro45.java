public class Pro45 {

    public int jump(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        int lastJump = 0, max = 0, length = nums.length - 1, jump = 0;

        for (int i = 0; i <= length; i++) {

            max = Math.max(max, i + nums[i]);

            if (i == lastJump) {
                lastJump = max;
                jump++;

                if (max >= length) {
                    return jump;
                }
            }

        }
        return jump;

    }


}
