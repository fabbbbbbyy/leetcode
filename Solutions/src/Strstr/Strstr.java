package Strstr;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class Strstr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }

        int startIndex = 0;

        while (startIndex < haystack.length()) {
            if (haystack.charAt(startIndex) == needle.charAt(0)) {
                boolean hasFound = true;
                for (int i = 1; i < needle.length(); i++) {
                    if (startIndex + i >= haystack.length() || haystack.charAt(startIndex + i) != needle.charAt(i)) {
                        startIndex++;
                        hasFound = false;
                        break;
                    }
                }

                if (hasFound) {
                    return startIndex;
                }
            } else {
                startIndex++;
            }
        }

        return -1;
    }
}
