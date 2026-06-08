import java.util.List;

public class Pro57 {

    public int[][] insert(int[][] intervals, int[] newInterval) {

        if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        List<int[]> result = new java.util.ArrayList<>();

        boolean isNewIntervalAdded = false;

        for (int i = 0; i < intervals.length; i++) {
            int[] current = intervals[i];

            if (!isNewIntervalAdded) {
                if (newInterval[1] < current[0]) {
                    result.add(newInterval);
                    result.add(current);
                    isNewIntervalAdded = true;
                } else if (newInterval[0] <= current[1] && newInterval[1] >= current[0]) {
                    current[0] = Math.min(current[0], newInterval[0]);
                    current[1] = Math.max(current[1], newInterval[1]);
                    result.add(current);
                    isNewIntervalAdded = true;
                } else {
                    result.add(intervals[i]);
                }
            }else {
                int[] last = result.get(result.size() - 1);

                if (current[0] <= last[1]) {
                    last[1] = Math.max(last[1], current[1]);
                } else {
                    result.add(current);
                }
            }
        }

        if (!isNewIntervalAdded) {
            result.add(newInterval);
        }

        return  result.toArray(new int[result.size()][]);

    }

}
