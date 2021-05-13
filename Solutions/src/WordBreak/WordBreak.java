package WordBreak;

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
