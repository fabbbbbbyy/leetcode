package ConvertBinaryNumberInALinkedListToAnInteger;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ConvertBinaryNumberInALinkedListToAnInteger {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode curr = head;
        while (curr != null) {
            num = num * 2 + curr.val;
            curr = curr.next;
        }
        return num;
    }
}
