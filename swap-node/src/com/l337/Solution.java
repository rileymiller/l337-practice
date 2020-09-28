package com.l337;

import java.util.List;

public class Solution {
    /**
     * Need to swap each adjacent node in the list, not the _values_, the
     * entire node.
     *
     * head
     * 1 -> 2 -> 3 -> 4 becomes 2 -> 1 -> 4 -> 3
     *
     * 1 -> 3 -> 4
     * temp = 2 -> 3 -> 4
     * 2 -> 1 -> 3 -> 4
     *
     *
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        // 0 -> null
        ListNode swap = new ListNode(0);

        // Create a node to traverse through the linked list, 0 -> null
        ListNode traverse = swap;

        // Set the next node for the root to be the head of the input list
        // 0 -> 1 -> 2 -> 3 -> 4 -> null
        traverse.next = head;

        // Verify that the next two nodes aren't null
        while(traverse.next != null && traverse.next.next != null) {
            // Grab the first node, first = 1 -> 2 -> 3 -> 4 -> null
            ListNode first = traverse.next;

            // Grab the second node, second = 2 -> 3 -> 4 -> null
            ListNode second = traverse.next.next;

            // Set the link for the first node equal to the third node, first = 1 -> 3 -> 4 -> null
            first.next = second.next;

            // Set the next node equal to the second node, traverse = 0 -> 2 -> 3 -> 4 -> null
            traverse.next = second;

            // stitch the nodes back together, second = 2 -> 1 -> 3 -> 4 -> null && traverse = 0 -> 2 -> 1 -> 3 -> 4 -> null
            second.next = first;

            // move traverse forward, traverse = 1 -> 3 -> 4 -> null
            traverse = first;
        }

        return swap.next;
    }

}
