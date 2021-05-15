package MergeIntervals;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) {
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<int[]> list = new ArrayList<>();
        int[] newInterval = intervals[0];

        for (int[] interval : intervals) {
            if (isOverlap(interval, newInterval) || isOverlap(newInterval, interval)) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            } else if (!isSameInterval(interval, newInterval)) {
                list.add(newInterval);
                newInterval = interval;
            }
        }

        list.add(newInterval);

        int[][] answer = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private boolean isOverlap(int[] interval1, int[] interval2) {
        return interval1[0] < interval2[1] && interval2[0] <= interval1[1];
    }

    private boolean isSameInterval(int[] interval1, int[] interval2) {
        return interval1[0] == interval2[0] && interval1[1] <= interval2[1];
    }
}
