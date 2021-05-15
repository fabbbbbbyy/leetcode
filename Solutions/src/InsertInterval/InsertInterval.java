package InsertInterval;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();

        int insertIndex = 0;
        boolean hasStartedMerging = false;
        for (int[] interval : intervals) {
            if (isOverlap(interval, newInterval) || isOverlap(newInterval, interval)) {
                newInterval[0] = Math.min(interval[0], newInterval[0]);
                newInterval[1] = Math.max(interval[1], newInterval[1]);
                hasStartedMerging = true;
            } else if (!hasStartedMerging) {
                list.add(interval);
                if (newInterval[0] >= interval[1]) {
                    insertIndex++;
                }
            } else {
                list.add(interval);
            }
        }

        list.add(insertIndex, newInterval);

        int[][] answer = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    private boolean isOverlap(int[] interval1, int[] interval2) {
        return interval1[0] < interval2[1] && interval2[0] <= interval1[1];
    }
}
