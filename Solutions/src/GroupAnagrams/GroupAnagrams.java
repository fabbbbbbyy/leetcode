package GroupAnagrams;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> duplicates = new HashMap<>();

        for (String s : strs) {
            char[] sArray = s.toCharArray();
            Arrays.sort(sArray);
            String sortedS = new String(sArray);

            if (!duplicates.containsKey(sortedS)) {
                List<String> anagrams = new ArrayList<>();
                anagrams.add(s);
                duplicates.put(sortedS, anagrams);
            } else {
                List<String> anagrams = duplicates.get(sortedS);
                anagrams.add(s);
                duplicates.put(sortedS, anagrams);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (String anagram : duplicates.keySet()) {
            ans.add(duplicates.get(anagram));
        }

        return ans;
    }
}
