package FirstBadVersion;

/* For submission, replace classname with Solution in Leetcode.*/

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        int l = 1;
        int r = n;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            boolean isBadMid = isBadVersion(mid);
            if (isBadMid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }

    // This is a mock API version of the question.
    private boolean isBadVersion(int num) {
        return true;
    }
}
