package ValidPalindrome;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (Character.isLetterOrDigit(character)) {
                sb.append(Character.toLowerCase(character));
            }
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
}
