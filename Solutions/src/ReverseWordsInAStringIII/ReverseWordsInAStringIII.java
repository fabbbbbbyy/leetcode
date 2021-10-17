package ReverseWordsInAStringIII;

import java.util.ArrayList;

/* For submission, replace classname with Solution in Leetcode.*/

public class ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitStr = s.split(" ");

        String reversed = reverseString(splitStr[0]);
        sb.append(reversed);

        for (int i = 1; i < splitStr.length; i++) {
            reversed = reverseString(splitStr[i]);
            sb.append(" ");
            sb.append(reversed);
        }

        return sb.toString();
    }

    private String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int l = 0;
        int r = s.length() - 1;

        while (l <= r) {
            char temp = charArray[l];
            charArray[l] = charArray[r];
            charArray[r] = temp;
            l++;
            r--;
        }

        return String.valueOf(charArray);
    }
}
