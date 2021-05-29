package LongestCommonPrefix;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";

        if (strs.length == 0) {
            return ans;
        }

        int shortestLength = Integer.MAX_VALUE;
        String shortestString = "";

        for (String s : strs) {
            if (s.length() < shortestLength) {
                shortestString = s;
                shortestLength = s.length();
            }
        }

        for (int i = 0; i < shortestLength; i++) {
            String currentPrefix = strs[0].substring(0, i + 1);
            boolean isSame = true;
            for (String s : strs) {
                if (!currentPrefix.equals(s.substring(0, i + 1))) {
                    isSame = false;
                    break;
                }
            }

            if (isSame) {
                ans = currentPrefix;
            } else {
                break;
            }
        }

        return ans;
    }
}
