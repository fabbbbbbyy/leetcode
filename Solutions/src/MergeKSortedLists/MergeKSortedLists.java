package MergeKSortedLists; /**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 *
 * Problem:
 * You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
 * Merge all the linked-lists into one sorted linked-list and return it.
 *
 * Insight: Various ways. Add all to array then collections.sort. Minheap using PQ. Slowly build up from minimum from all lists.
 */

/* For submission, replace classname with Solution in Leetcode.*/

import java.util.*;

public class MergeKSortedLists {
    public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();

        while (true) {
            boolean allEmpty = true;
            int minIndex = 0;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < lists.length; i++) {
                if (lists[i] != null) {
                    if (lists[i].val < min) {
                        minIndex = i;
                        min = lists[i].val;
                    }
                    allEmpty = false;
                }
            }

            if (allEmpty) {
                break;
            }

            minHeap.offer(lists[minIndex].val);
            lists[minIndex] = lists[minIndex].next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;

        while (minHeap.size() > 0) {
            prev.next = new ListNode(minHeap.poll());
            prev = prev.next;
        }

        return dummy.next;
    }
}
