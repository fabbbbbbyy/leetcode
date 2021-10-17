package AddTwoNumbers;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.Stack;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int sum = carry;

            sum += l1.val;
            l1 = l1.next;
            sum += l2.val;
            l2 = l2.next;

            if (sum >= 10) {
                ListNode next = new ListNode(sum % 10);
                curr.next = next;
                curr = curr.next;
                carry = 1;
            } else {
                ListNode next = new ListNode(sum);
                curr.next = next;
                curr = curr.next;
                carry = 0;
            }
        }

        while (l1 != null) {
            int sum = carry;

            sum += l1.val;
            l1 = l1.next;

            if (sum >= 10) {
                ListNode next = new ListNode(sum % 10);
                curr.next = next;
                curr = curr.next;
                carry = 1;
            } else {
                ListNode next = new ListNode(sum);
                curr.next = next;
                curr = curr.next;
                carry = 0;
            }
        }

        while (l2 != null) {
            int sum = carry;

            sum += l2.val;
            l2 = l2.next;

            if (sum >= 10) {
                ListNode next = new ListNode(sum % 10);
                curr.next = next;
                curr = curr.next;
                carry = 1;
            } else {
                ListNode next = new ListNode(sum);
                curr.next = next;
                curr = curr.next;
                carry = 0;
            }
        }

        if (carry != 0) {
            ListNode next = new ListNode(carry);
            curr.next = next;
            curr = curr.next;
        }

        return dummy.next;
    }
}
