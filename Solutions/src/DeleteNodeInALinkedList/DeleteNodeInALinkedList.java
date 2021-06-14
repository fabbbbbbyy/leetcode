package DeleteNodeInALinkedList;

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class DeleteNodeInALinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public void deleteNode(ListNode node) {
        ListNode currNode = node;
        while (currNode.next.next != null) {
            currNode.val = currNode.next.val;
            currNode = currNode.next;
        }
        currNode.val = currNode.next.val;
        currNode.next = null;
    }
}
