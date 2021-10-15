package MeetingRoomsII;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MeetingRoomsII {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int firstEndingTime = intervals[0][1];
        minHeap.add(firstEndingTime);

        for (int i = 1; i < intervals.length; i++) {
            int earliestEndingTime = minHeap.peek();
            int[] currInterval = intervals[i];
            int currStartTime = currInterval[0];
            int currEndTime = currInterval[1];

            if (earliestEndingTime <= currStartTime) {
                minHeap.poll();
                minHeap.offer(currEndTime);
            } else {
                minHeap.offer(currEndTime);
            }
        }

        return minHeap.size();
    }

    private boolean isOverlap(int[] a, int[] b) {
        return a[0] < b[1] && b[0] < a[1];
    }
}
