public class Pro11 {
    public int maxArea(int[] height) {
//        int length = height.length;
//        int lomba = 0;
//        if (height[0] > height[length - 1]) {
//            lomba = height[length - 1];
//        } else {
//            lomba = height[0];
//        }
//        int maxheight = lomba * (length - 1);
//        int preNext = 0;
//        int lastNext = length - 1;
//        while (preNext != lastNext) {
//            if (height[preNext] > height[lastNext]) {
//                lastNext--;
//            } else {
//                preNext++;
//            }
//
//            if (height[preNext] > height[lastNext]) {
//                lomba = height[lastNext];
//            } else {
//                lomba = height[preNext];
//            }
//            int temp = lomba * (lastNext - preNext);
//            if (temp > maxheight) {
//                maxheight = temp;
//            }
//        }
//
//        return maxheight;

        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;

            int currentHeight = Math.min(height[left], height[right]);
            int currentArea = currentHeight * width;

            maxWater = Math.max(maxWater, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;

    }


}
