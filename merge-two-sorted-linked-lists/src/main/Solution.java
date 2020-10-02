package main;


public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode anchor = new ListNode(0);
        ListNode buildr = anchor;
        ListNode traverse1 = l1;
        ListNode traverse2 = l2;

        while (traverse1 != null || traverse2 != null) {
            if(traverse1 != null && traverse2 != null) {
                if(traverse1.val < traverse2.val ) {
                    buildr.next = traverse1;
                    buildr = buildr.next;
                    traverse1 = traverse1.next;
                } else {
                    buildr.next = traverse2;
                    buildr = buildr.next;
                    traverse2 = traverse2.next;
                }
            } else if(traverse1 == null && traverse2 != null) {
                buildr.next = traverse2;
                buildr = buildr.next;
                traverse2 = traverse2.next;
            } else {
                buildr.next = traverse1;
                buildr = buildr.next;
                traverse1 = traverse1.next;
            }
        }

        return anchor.next;
    }
}
