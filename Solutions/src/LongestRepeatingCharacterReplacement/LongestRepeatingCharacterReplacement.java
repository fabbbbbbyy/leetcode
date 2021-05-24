package LongestRepeatingCharacterReplacement;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int maxRepeat = 0;
        int maxWindow = 0;

        HashMap<Character, Integer> frequencies = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            if (!frequencies.containsKey(s.charAt(right))) {
                frequencies.put(s.charAt(right), 1);
            } else {
                frequencies.put(s.charAt(right), frequencies.get(s.charAt(right)) + 1);
            }

            maxRepeat = Math.max(maxRepeat, frequencies.get(s.charAt(right)));

            if (right - left + 1 - maxRepeat > k) {
                frequencies.put(s.charAt(left), frequencies.get(s.charAt(left)) - 1);
                left++;
            }

            maxWindow = Math.max(maxWindow, right - left + 1);
        }

        return maxWindow;
    }
}
