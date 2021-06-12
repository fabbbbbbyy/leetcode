package FirstUniqueCharacterInAString;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (!frequencies.containsKey(character)) {
                frequencies.put(character, 1);
            } else {
                frequencies.put(character, frequencies.get(character) + 1);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (frequencies.get(character) == 1) {
                return i;
            }
        }

        return -1;
    }
}
