package solutions;

import java.util.HashMap;
import java.util.Map;

public class C6417_Frequency_Tracker {
    class FrequencyTracker {
        //map<value, frequency>
        Map<Integer, Integer> frequency;
        //map<frequencyCount, frequency>
        //like 2 accurs 3 times then the map will present map< 3, 2>
        Map<Integer, Integer> frequencyCount;

        public FrequencyTracker() {
            frequency = new HashMap<>();
            frequencyCount = new HashMap<>();
        }

        public void add(int number) {
            int accu = frequency.getOrDefault(number, 0);
            frequency.put(number, accu + 1);
            frequencyCount.put(accu + 1, frequencyCount.getOrDefault(accu + 1, 0) + 1);
            if (frequencyCount.getOrDefault(accu, 0) != 0) {
                frequencyCount.put(accu, frequencyCount.get(accu) - 1);
            }
        }

        public void deleteOne(int number) {
            if (frequency.containsKey(number)) {
                int accu = frequency.get(number);
                if (accu > 1) {
                    frequency.put(number, accu - 1);
                    frequencyCount.put(accu, frequencyCount.get(accu) - 1);
                    frequencyCount.put(accu - 1, frequencyCount.get(accu - 1) + 1);
                } else {
                    frequency.remove(number);
                    frequencyCount.put(1, frequencyCount.get(1) - 1);
                }
            }
        }

        public boolean hasFrequency(int frequency) {
            int count = frequencyCount.getOrDefault(frequency, 0);
            return count != 0;
        }
    }
}
