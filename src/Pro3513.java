import java.util.HashSet;

public class Pro3513 {
    public int uniqueXorTriplets(int[] nums) {

        int length = nums.length;
        HashSet<Integer> uniqueXors = new HashSet<>();

        for(int i = 0; i< length; i++){
            for (int j = i ; j < length; j++){
                for (int k = j ; k< length; k++){
                    int xor = nums[i] ^ nums[j] ^ nums[k];
                    uniqueXors.add(xor);
                }
            }
        }

        return uniqueXors.size();

    }
}
