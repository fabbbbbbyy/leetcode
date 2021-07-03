package PartitionList;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class PartitionList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode partition(ListNode head, int x) {
        ListNode beforeHead = new ListNode();
        ListNode beforeCurr = beforeHead;
        ListNode afterHead = new ListNode();
        ListNode afterCurr = afterHead;

        ListNode curr = head;
        while (curr != null) {
            if (curr.val < x) {
                beforeCurr.next = curr;
                beforeCurr = beforeCurr.next;
            } else {
                afterCurr.next = curr;
                afterCurr = afterCurr.next;
            }
            curr = curr.next;
        }

        beforeCurr.next = null;
        afterCurr.next = null;

        beforeCurr = beforeHead.next;
        afterCurr = afterHead.next;

        ListNode ans = new ListNode();
        ListNode ansCurr = ans;

        while (beforeCurr != null) {
            ansCurr.next = beforeCurr;
            ansCurr = ansCurr.next;
            beforeCurr = beforeCurr.next;
        }

        while (afterCurr != null) {
            ansCurr.next = afterCurr;
            ansCurr = ansCurr.next;
            afterCurr = afterCurr.next;
        }

        return ans.next;
    }
}
