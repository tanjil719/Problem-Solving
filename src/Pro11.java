public class Pro11 {
    public int maxArea(int[] height) {
        int length = height.length;
        int lomba = 0;
        if (height[0] > height[length - 1]) {
            lomba = height[length - 1];
        } else {
            lomba = height[0];
        }
        int maxheight = lomba * (length - 1);
        int preNext = 0;
        int lastNext = length - 1;
        while (preNext != lastNext) {
            if (height[preNext] > height[lastNext]) {
                lastNext--;
            } else {
                preNext++;
            }

            if (height[preNext] > height[lastNext]) {
                lomba = height[lastNext];
            } else {
                lomba = height[preNext];
            }
            int temp = lomba * (lastNext - preNext);
            if (temp > maxheight) {
                maxheight = temp;
            }
        }

        return maxheight;
    }
}
