# Merge Two Sorted Lists

[Leet Code link](https://leetcode.com/problems/merge-two-sorted-lists/)

Merge two sorted linked lists and return it as a new **sorted** list. The new list should be made by splicing together the nodes of the first two lists.

**Example:**

Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4

Steps for my solution:
1. Setup anchor node
2. Setup buildr node that will move through the list
3. Setup traveral nodes for l1 and l2 (these probably aren't need necessarily)
4. Loop through the lists at the same time and check which node in the smallest, append
that node to the new list

### Complexity
**O(n)**
