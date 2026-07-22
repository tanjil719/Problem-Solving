import java.util.ArrayList;
import java.util.List;

public class Pro3501 {
    private int[] positionToRun;
    private int[] runStart;
    private int[] runEnd;
    private char[] runType;
    private int[] candidateGain;
    private int[] segmentTree;
    private int runCount;
    private int totalOnes;

    public List<Integer> maxActiveSectionsAfterTrade(String s, int[][] queries) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            for (int i = 0; i < queries.length; i++) {
                result.add(0);
            }
            return result;
        }

        totalOnes = countOnes(s);
        buildRuns(s);

        segmentTree = new int[Math.max(1, runCount * 4)];
        buildSegmentTree(1, 0, runCount - 1);

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];

            int leftRun = positionToRun[left];
            int rightRun = positionToRun[right];

            int bestGain = getBestGain(left, right, leftRun, rightRun);
            result.add(totalOnes + bestGain);
        }

        return result;
    }

    private int countOnes(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        return count;
    }

    private void buildRuns(String s) {
        int n = s.length();
        positionToRun = new int[n];

        int runs = 0;
        for (int i = 0; i < n; ) {
            char current = s.charAt(i);
            int j = i;
            while (j < n && s.charAt(j) == current) {
                j++;
            }
            runs++;
            i = j;
        }

        runCount = runs;
        runStart = new int[runCount];
        runEnd = new int[runCount];
        runType = new char[runCount];
        candidateGain = new int[runCount];

        int runIndex = 0;
        for (int i = 0; i < n; ) {
            char current = s.charAt(i);
            int j = i;
            while (j < n && s.charAt(j) == current) {
                j++;
            }

            runStart[runIndex] = i;
            runEnd[runIndex] = j - 1;
            runType[runIndex] = current;

            for (int k = i; k < j; k++) {
                positionToRun[k] = runIndex;
            }

            runIndex++;
            i = j;
        }

        for (int i = 0; i < runCount; i++) {
            if (runType[i] == '1' && i > 0 && i + 1 < runCount && runType[i - 1] == '0' && runType[i + 1] == '0') {
                int leftZeroLen = runEnd[i - 1] - runStart[i - 1] + 1;
                int rightZeroLen = runEnd[i + 1] - runStart[i + 1] + 1;
                candidateGain[i] = leftZeroLen + rightZeroLen;
            }
        }
    }

    private void buildSegmentTree(int node, int left, int right) {
        if (left == right) {
            segmentTree[node] = candidateGain[left];
            return;
        }

        int mid = (left + right) >>> 1;
        buildSegmentTree(node << 1, left, mid);
        buildSegmentTree(node << 1 | 1, mid + 1, right);
        segmentTree[node] = Math.max(segmentTree[node << 1], segmentTree[node << 1 | 1]);
    }

    private int getBestGain(int left, int right, int leftRun, int rightRun) {
        int firstInternalRun = leftRun + 1;
        int lastInternalRun = rightRun - 1;

        if (firstInternalRun > lastInternalRun) {
            return 0;
        }

        int bestGain = 0;
        int leftSpecial = -1;
        int rightSpecial = -1;

        if (runType[leftRun] == '0'
                && firstInternalRun < runCount
                && runType[firstInternalRun] == '1'
                && candidateGain[firstInternalRun] > 0) {
            leftSpecial = firstInternalRun;
            bestGain = Math.max(bestGain, getClippedGain(leftSpecial, left, right));
        }

        if (runType[rightRun] == '0'
                && lastInternalRun >= 0
                && runType[lastInternalRun] == '1'
                && candidateGain[lastInternalRun] > 0) {
            rightSpecial = lastInternalRun;
            bestGain = Math.max(bestGain, getClippedGain(rightSpecial, left, right));
        }

        int currentStart = firstInternalRun;

        if (leftSpecial != -1 && currentStart <= leftSpecial - 1) {
            bestGain = Math.max(bestGain, queryMax(1, 0, runCount - 1, currentStart, leftSpecial - 1));
        }
        if (leftSpecial != -1) {
            currentStart = leftSpecial + 1;
        }

        if (rightSpecial != -1 && currentStart <= rightSpecial - 1) {
            bestGain = Math.max(bestGain, queryMax(1, 0, runCount - 1, currentStart, rightSpecial - 1));
        }
        if (rightSpecial != -1) {
            currentStart = rightSpecial + 1;
        }

        if (currentStart <= lastInternalRun) {
            bestGain = Math.max(bestGain, queryMax(1, 0, runCount - 1, currentStart, lastInternalRun));
        }

        return bestGain;
    }

    private int getClippedGain(int runIndex, int left, int right) {
        int leftZeroRun = runIndex - 1;
        int rightZeroRun = runIndex + 1;

        int leftLen = Math.min(runEnd[leftZeroRun], right) - Math.max(runStart[leftZeroRun], left) + 1;
        int rightLen = Math.min(runEnd[rightZeroRun], right) - Math.max(runStart[rightZeroRun], left) + 1;

        return leftLen + rightLen;
    }

    private int queryMax(int node, int left, int right, int ql, int qr) {
        if (ql > qr) {
            return 0;
        }
        if (qr < left || right < ql) {
            return 0;
        }
        if (ql <= left && right <= qr) {
            return segmentTree[node];
        }

        int mid = (left + right) >>> 1;
        return Math.max(
                queryMax(node << 1, left, mid, ql, qr),
                queryMax(node << 1 | 1, mid + 1, right, ql, qr)
        );
    }
}