import java.util.Arrays;

public class Pro274 {

    public int hIndex(int[] citations) {
//        int length = citations.length - 1;
//        Arrays.sort(citations);
//        int h = citations[0];
//
//        for (int i = 1; i <= length; i++) {
//            if ((citations[i] + i) - 1 == length) {
//                h = citations[i];
//            }
//        }
//
//        return h;

        int[] bucket = new int[citations.length + 1];

        for (int i = 0; i < citations.length; i++) {
            if (citations[i] > citations.length)
                bucket[citations.length]++;
            else
                bucket[citations[i]]++;
        }

        int count = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            count += bucket[i];
            if (count >= i)
                return i;
        }

        return 0;
    }

}



