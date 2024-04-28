public class Pro42 {
    public int trap(int[] height) {
        int length = height.length;
        int count = 0, p = 0, revP = length - 1, base = 0;
        for (int i = 1; i < length; i++) {
            if (height[p] > height[i]) {
                count += height[p] - height[i];
            } else {
                p = i;
            }
        }

        if (p != length - 1) {
            for (int i = length - 1; i > p; i--) {
                if (height[i] > height[revP]) {
                    revP = i;
                    count -= height[p] - height[revP];
                } else {
                    count -= height[p] - height[revP];
                }
            }
        }
        return count;
    }
}
