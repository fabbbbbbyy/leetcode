package PairsOfSongsWithDurationsDivisibleBy60;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class PairsOfSongsWithDurationsDivisibleBy60 {
    public int numPairsDivisibleBy60(int[] time) {
        for (int i = 0; i < time.length; i++) {
            time[i] = time[i] % 60;
        }

        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < time.length; i++) {
            if (frequencies.containsKey(time[i])) {
                frequencies.put(time[i], frequencies.get(time[i]) + 1);
            } else {
                frequencies.put(time[i], 1);
            }
        }

        int numPairs = 0;
        for (int num : time) {
            int complement = 60 - num;
            if (num == 0) {
                complement = 0;
            }

            if (frequencies.get(num) == 1) {
                frequencies.remove(num);
            } else {
                frequencies.put(num, frequencies.get(num) - 1);
            }

            if (frequencies.containsKey(complement)) {
                numPairs += frequencies.get(complement);
            }
        }

        return numPairs;
    }
}
