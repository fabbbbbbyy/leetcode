# Link

https://leetcode.com/problems/linked-list-cycle/

## Insight

Slow and fast pointer method. If there is a cycle, the faster pointer
will eventually reach the slower pointer which would be impossible if there was 
no cycle in the list. We have the while loop checks to prevent fast from
pointing to a null value, since we are doing fast.next.next, we have to ensure
that fast and fast.next are not null. 