package tests;

import main.ListNode;
import main.Solution;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void BasicTest() {
        Solution sol = new Solution();
        ListNode[] listArr = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5, null))),
                new ListNode(1, new ListNode(3, new ListNode(4, null))),
                new ListNode(2, new ListNode(6, new ListNode(5, null)))
        };

        ListNode spliced = sol.mergeKLists(listArr);
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
        assertEquals(5, spliced.val);
        spliced = spliced.next;
        assertEquals(6, spliced.val);
        spliced = spliced.next;
        assertEquals(null, spliced);
    }

}
