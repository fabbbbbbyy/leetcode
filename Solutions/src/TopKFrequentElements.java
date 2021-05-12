/**
 * https://leetcode.com/problems/top-k-frequent-elements/
 *
 * Problem:
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Insight: Various ways. Tried with normal ArrayList then Collections.sort, and a minHeap. MinHeap was just slightly faster.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        for (int num : nums) {
            if (frequencies.containsKey(num)) {
                frequencies.put(num, frequencies.get(num) + 1);
            } else {
                frequencies.put(num, 1);
            }
        }

        PriorityQueue<Tuple> minHeap = new PriorityQueue<>((t1, t2) -> t2.frequency - t1.frequency);
        // ArrayList<Tuple> minHeap = new ArrayList<>();
        for (int num : frequencies.keySet()) {
            // minHeap.add(new Tuple(num, frequencies.get(num)));
            minHeap.offer(new Tuple(num, frequencies.get(num)));
        }

        // Collections.sort(minHeap, (t1, t2) -> t1.frequency - t2.frequency);

        int[] ans = new int[k];
        int index = 0;
        // for (int i = minHeap.size() - 1; i >= minHeap.size() - k; i--) {
        //     ans[index] = minHeap.get(i).num;
        //     index++;
        // }
        for (int i = 0; i < k; i++) {
            ans[index] = minHeap.poll().num;
            index++;
        }

        return ans;
    }

    class Tuple {
        int num;
        int frequency;
        public Tuple(int num, int frequency) {
            this.num = num;
            this.frequency = frequency;
        }
    }
}
