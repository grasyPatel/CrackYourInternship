package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class insertDeleteGetRandomDuplicatesAllowed {
    public static void main(String[] args) {
        RandomizedCollection obj=new RandomizedCollection();
        boolean param_1 = obj.insert(1);
        boolean param_3 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        int param_4 = obj.getRandom();
        System.out.println(param_1+" " +param_2+" "+param_3+" "+param_4);
    }

    
}
class RandomizedCollection {

    List<Integer> nums;
    Map<Integer, Set<Integer>> idxMap;
    Random random;

    public  RandomizedCollection() {
        nums = new ArrayList<>();
        idxMap = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        boolean response = !idxMap.containsKey(val);

        if (response) {
            idxMap.put(val, new HashSet<>());
        }
        idxMap.get(val).add(nums.size());
        nums.add(val);

        return response;
    }

    public boolean remove(int val) {
        if (!idxMap.containsKey(val)) {
            return false;
        }

        Set<Integer> idxSet = idxMap.get(val);
        int idxToBeRemoved = idxSet.iterator().next();
        if (idxSet.size() == 1) {
            idxMap.remove(val);
        } else {
            idxSet.remove(idxToBeRemoved);
        }

        int lastIdx = nums.size() - 1;
        if (idxToBeRemoved != lastIdx) {
            int lastVal = nums.get(lastIdx);
            Set<Integer> lastIdxSet = idxMap.get(lastVal);
            lastIdxSet.add(idxToBeRemoved);
            lastIdxSet.remove(lastIdx);
            nums.set(idxToBeRemoved, lastVal);
        }

        nums.remove(lastIdx);

        return true;
    }

    public int getRandom() {
        int randomIndex = random.nextInt(nums.size());
        return nums.get(randomIndex);
    }
}
