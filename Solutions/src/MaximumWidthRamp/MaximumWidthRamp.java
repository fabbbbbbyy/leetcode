package MaximumWidthRamp;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MaximumWidthRamp {
    public int maxWidthRamp(int[] nums) {
        int maxWidth = 0;
        if (nums.length == 0 || nums.length == 1) {
            return maxWidth;
        }

        ArrayList<Tuple> tuples = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            tuples.add(new Tuple(i, nums[i]));
        }

        Collections.sort(tuples, (tuple1, tuple2) -> tuple1.value - tuple2.value);

        int minIdx = tuples.get(0).indice;
        for (Tuple tuple : tuples) {
            maxWidth = Math.max(maxWidth, tuple.indice - minIdx);
            minIdx = Math.min(minIdx, tuple.indice);
        }

        return maxWidth;
    }

    class Tuple {
        int indice;
        int value;

        public Tuple(int indice, int value) {
            this.indice = indice;
            this.value = value;
        }
    }
}
