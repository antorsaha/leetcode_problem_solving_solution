package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P0380_Insert_Delete_GetRandom_O_1 {
    class RandomizedSet {
        List<Integer> arr;
        Map<Integer, Integer> map;

        public RandomizedSet() {
            arr = new ArrayList<>();
            map = new HashMap<>();

        }

        public boolean insert(int val) {
            if (map.containsKey(val))
                return false;

            map.put(val, arr.size());
            arr.add(val);
            return true;
        }

        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;

            int index = map.get(val);
            int lastElement = arr.get(arr.size() - 1);
            arr.set(index, lastElement);
            map.put(lastElement, index);
            map.remove(val);
            arr.remove(arr.size() - 1);
            return true;
        }

        public int getRandom() {
            int random = (int) (Math.random() * arr.size());
            return arr.get(random);

        }
    }

}
