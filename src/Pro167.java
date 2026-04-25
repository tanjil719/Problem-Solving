public class Pro167 {

    public int[] twoSum(int[] numbers, int target) {

        // Two-Pointer Approach
//        int left = 0, right = numbers.length - 1;
//        while(left < right){
//            int sum = numbers[left] + numbers[right];
//            if(sum == target){
//                return new int[]{left + 1, right + 1};
//            } else if(sum < target){
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return new int[]{-1, -1};


        //Binary search approach
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];

            int left = i + 1;
            int right = numbers.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (numbers[mid] == complement) {
                    return new int[]{i + 1, mid + 1};
                } else if (numbers[mid] < complement) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }



}
