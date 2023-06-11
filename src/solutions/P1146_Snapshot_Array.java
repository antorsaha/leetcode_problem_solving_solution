package solutions;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class P1146_Snapshot_Array {

    class SnapshotArray {
        TreeMap<Integer, Integer>[] Tm;
        int snap_id = 0;
        public SnapshotArray(int length) {
            Tm = new TreeMap[length];
            for (int i = 0; i < length; i++) {
                Tm[i] = new TreeMap<Integer, Integer>();
                Tm[i].put(0, 0);
            }
        }

        public void set(int index, int val) {
            Tm[index].put(snap_id, val);
        }

        public int snap() {
            return snap_id++;
        }

        public int get(int index, int snap_id) {
            return Tm[index].floorEntry(snap_id).getValue();
        }
    }


    /*memory limit exceeded
    class SnapshotArray {
        int[] array;
        int snapCount = -1;
        Map<Integer, int[]> snapShoot = new HashMap<>();

        public SnapshotArray(int length) {
            array = new int[length];
        }

        public void set(int index, int val) {
            array[index] = val;
        }

        public int snap() {
            snapCount++;
            snapShoot.put(snapCount, array.clone());
            System.out.println("hashmap put " + snapCount);
            for (int j : array) {
                System.out.println(j);
            }


            return snapCount;
        }

        public int get(int index, int snap_id) {
            return snapShoot.get(snap_id)[index];
        }
    }*/

}
