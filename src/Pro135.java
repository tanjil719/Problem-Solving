import java.util.Arrays;

public class Pro135 {
    public int candy(int[] ratings) {
        int length = ratings.length;
        int[] result = new int[length];
        Arrays.fill(result, 1);
        for (int i = length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                result[i] = result[i + 1] + 1;
            }
        }

        for (int i = 1; i < length; i++) {
            if (ratings[i - 1] < ratings[i] && result[i] <= result[i-1] ) {
                result[i] = result[i - 1] + 1;
            }
        }

        int sum =0;
        for (int i =0; i<length; i++){
            sum += result[i];
        }

        return sum;
    }
}
