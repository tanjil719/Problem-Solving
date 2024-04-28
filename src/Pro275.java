public class Pro275 {
    public int hIndex(int[] citations) {
        int length = citations.length;
        int index = 0;
        while (index < length && length - index > citations[index]) {
            index++;
        }

        return length-index;
    }
}
