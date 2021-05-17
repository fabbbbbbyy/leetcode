package MergeTwoSortedLists;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MergeTwoSortedLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = new ListNode(l1.val);
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = new ListNode(l2.val);
                curr = curr.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            curr.next = new ListNode(l1.val);
            curr = curr.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            curr.next = new ListNode(l2.val);
            curr = curr.next;
            l2 = l2.next;
        }

        return dummy.next;
    }
}
