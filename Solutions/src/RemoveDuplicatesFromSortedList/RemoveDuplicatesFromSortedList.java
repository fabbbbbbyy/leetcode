package RemoveDuplicatesFromSortedList;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class RemoveDuplicatesFromSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        boolean isSameValue = dummy.val == head.val;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (prev.val == curr.val) {
                prev.next = curr.next;
                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        if (isSameValue) {
            return dummy;
        } else {
            return dummy.next;
        }
    }
}
