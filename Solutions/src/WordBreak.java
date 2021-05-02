/**
 * https://leetcode.com/problems/word-break/
 *
 * Problem:
 * Given a string s and a dictionary of strings wordDict, return true if s can be segmented into a space-separated
 * sequence of one or more dictionary words.
 * Note that the same word in the dictionary may be reused multiple times in the segmentation.
 *
 * Insight: Remember that different types of caches can be used based on the problem. It is easier to use
 * a HashMap for subproblems which rely on changing variables like Strings. 
 *
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashMap<String, Boolean> cache = new HashMap<>();
        return canWordBreak(s, wordDict, cache);
    }

    private boolean canWordBreak(String s, List<String> wordDict, HashMap<String, Boolean> cache) {
        if (cache.containsKey(s)) {
            return cache.get(s);
        }

        if (s.isEmpty()) {
            return true;
        }

        for (String word : wordDict) {
            if (s.startsWith(word)) {
                if (canWordBreak(s.substring(word.length()), wordDict, cache)) {
                    cache.put(s, true);
                    return true;
                }
            }
        }

        cache.put(s, false);
        return false;
    }
}
