import java.util.HashMap;
import java.util.Map;


public class Single_Number {
    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            if (!frequencyMap.containsKey(num)) frequencyMap.put(num, 0);
            frequencyMap.put(num, frequencyMap.get(num) + 1);
        }
        for (Integer key: frequencyMap.keySet()) {
            if (frequencyMap.get(key) == 1) return key;
        }
        return -1;
    }
}
