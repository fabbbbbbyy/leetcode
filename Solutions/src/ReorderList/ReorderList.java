package ReorderList;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class ReorderList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode beforeMiddle = slow;
        ListNode curr = beforeMiddle.next;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        beforeMiddle.next = prev;

        slow = head;
        fast = beforeMiddle;

        while (slow != fast) {
            ListNode afterSlow = slow.next;
            ListNode afterFast = fast.next.next;
            slow.next = fast.next;
            fast.next.next = afterSlow;
            fast.next = afterFast;
            slow = afterSlow;
        }
    }
}
