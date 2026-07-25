import java.util.Arrays;

public class Pro3514 {
    public static int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        boolean[] freq = new boolean[2048];
        int len = 0, idx = 0, ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (!freq[nums[i] ^ nums[j]]) {
                    len++;
                    freq[nums[i] ^ nums[j]] = true;
                }
            }
        }

        int[] ar = new int[len];

        for (int i = 0; i < 2048; i++) {
            if (freq[i]) {
                ar[idx++] = i;
            }
        }
        Arrays.fill(freq, false);

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < n; j++) {
                freq[ar[i] ^ nums[j]] = true;
            }
        }

        for (boolean b : freq) {
            if (b) {
                ans++;
            }
        }

        return ans;
    }
}
