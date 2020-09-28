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

        ListNode swap = new ListNode(0);

        ListNode traverse = swap;

        traverse.next = head;

        while(traverse.next != null && traverse.next.next != null) {
            ListNode first = traverse.next;

            ListNode second = traverse.next.next;

            first.next = second.next;

            traverse.next = second;

            second.next = first;

            traverse = first;
        }

        return swap.next;
    }

}
