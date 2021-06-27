package SwapNodesInPairs;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class SwapNodesInPairs {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode swapPairs(ListNode head) {
            if(head == null || head.next == null) {
                return head;
            }

            ListNode dummy = new ListNode(0);
            ListNode prev = dummy;
            ListNode curr = head;

            while(curr != null && curr.next != null) {
                ListNode temp = curr.next.next;
                prev.next = curr.next;
                prev.next.next = curr;
                curr.next = temp;

                prev = curr;
                curr = curr.next;
            }

            return dummy.next;
        }
    }
}
