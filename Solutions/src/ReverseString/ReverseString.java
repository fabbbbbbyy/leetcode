package ReverseString;

import java.util.ArrayList;

/* For submission, replace classname with Solution in Leetcode.*/

public class ReverseString {
    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;

        while (l <= r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }
}
