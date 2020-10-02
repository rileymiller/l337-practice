import com.l337.ListNode;
import com.l337.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void NullTest() {
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(null);
        assertEquals(swap, null);
    }

    @Test
    void OneNode() {
        ListNode head = new ListNode(1);
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(head);
        assertEquals(swap, head);
    }

    @Test
    void TwoNodes() {
        ListNode head = new ListNode(1, new ListNode(2));
        ListNode memComp = head;
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(head);
        // 2 -> 1 -> null
        assertEquals(swap.val, 2);
        swap = swap.next;
        assertEquals(swap.val, 1);
        swap = swap.next;
        assertEquals(swap, null);
    }

    @Test
    void ThreeNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode memComp = head;
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(head);
        // 2 -> 1 -> null
        assertEquals(swap.val, 2);
        swap = swap.next;
        assertEquals(swap.val, 1);
        swap = swap.next;
        assertEquals(swap.val, 3);
        swap = swap.next;
        assertEquals(swap, null);
    }

    @Test
    void FourNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
        ListNode memComp = head;
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(head);
        // 2 -> 1 -> 4 -> 3 null
        assertEquals(swap.val, 2);
        swap = swap.next;
        assertEquals(swap.val, 1);
        swap = swap.next;
        assertEquals(swap.val, 4);
        swap = swap.next;
        assertEquals(swap.val, 3);
        swap = swap.next;
        assertEquals(swap, null);
    }

    @Test
    void FiveNodes() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode memComp = head;
        Solution solution = new Solution();
        ListNode swap = solution.swapPairs(head);
        // 2 -> 1 -> 4 -> 3 null
        assertEquals(swap.val, 2);
        swap = swap.next;
        assertEquals(swap.val, 1);
        swap = swap.next;
        assertEquals(swap.val, 4);
        swap = swap.next;
        assertEquals(swap.val, 3);
        swap = swap.next;
        assertEquals(swap.val, 5);
        swap = swap.next;
        assertEquals(swap, null);
    }
}
