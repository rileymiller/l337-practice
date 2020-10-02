package tests;

import main.ListNode;
import main.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {

    @Test
    void BasicTest() {
        Solution sol = new Solution();
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4, null) ));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4, null) ));

        ListNode spliced = sol.mergeTwoLists(l1, l2);

        assertEquals(1, spliced.val);
        spliced = spliced.next;
        assertEquals(1, spliced.val);
        spliced = spliced.next;
        assertEquals(2, spliced.val);
        spliced = spliced.next;
        assertEquals(3, spliced.val);
        spliced = spliced.next;
        assertEquals(4, spliced.val);
        spliced = spliced.next;
        assertEquals(4, spliced.val);
        spliced = spliced.next;
        assertEquals(null, spliced);
    }

    @Test
    void NullTest() {
        Solution sol = new Solution();
        assertEquals(null, sol.mergeTwoLists(null, null));
    }
}
