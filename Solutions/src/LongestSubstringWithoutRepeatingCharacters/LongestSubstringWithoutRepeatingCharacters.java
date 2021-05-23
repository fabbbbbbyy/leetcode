package LongestSubstringWithoutRepeatingCharacters;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s.length();
        }

        int maxLength = 0;
        int currStartPos = 0;
        HashSet<Character> duplicates = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (!duplicates.contains(s.charAt(i))) {
                duplicates.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - currStartPos + 1);
            } else {
                duplicates.remove(s.charAt(currStartPos));
                currStartPos++;
                i--;
            }
        }

        return maxLength;
    }
}
