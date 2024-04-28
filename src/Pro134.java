public class Pro134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int dif = 0, index = 0, totalFuel = 0, totalCost = 0;
        int n = gas.length;

        for (int i = 0; i < n; i++) {
            totalFuel += gas[i];
            totalCost += cost[i];
        }

        if (totalFuel < totalCost) return -1;

        for (int i = 0; i < gas.length; i++) {
            if (dif < 0) {
                index = i;
                dif = 0;
            }
            dif += gas[i] - cost[i];
        }
        return index;

//        int totalFuel = 0, totalCost = 0;
//        int n = gas.length;
//        for (int i = 0; i < n; i++) {
//            totalFuel += gas[i];
//            totalCost += cost[i];
//        }
//
//        if (totalFuel < totalCost) return -1;
//        int startingIdx = 0, currentFuel = 0;
//        for (int i = 0; i < n; i++) {
//            if (currentFuel < 0) {
//                //not possible to start from i-1th to reach ith index
//                currentFuel = 0;
//                startingIdx = i;
//            }
//            currentFuel += gas[i] - cost[i];
//        }
//        return startingIdx;

//        return -1;
    }
}
