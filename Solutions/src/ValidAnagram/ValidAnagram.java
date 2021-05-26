package ValidAnagram;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> frequenciesS = new HashMap<>();
        HashMap<Character, Integer> frequenciesT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!frequenciesS.containsKey(s.charAt(i))) {
                frequenciesS.put(s.charAt(i), 1);
            } else {
                frequenciesS.put(s.charAt(i), frequenciesS.get(s.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (!frequenciesT.containsKey(t.charAt(i))) {
                frequenciesT.put(t.charAt(i), 1);
            } else {
                frequenciesT.put(t.charAt(i), frequenciesT.get(t.charAt(i)) + 1);
            }
        }

        return frequenciesS.entrySet().equals(frequenciesT.entrySet());
    }
}
