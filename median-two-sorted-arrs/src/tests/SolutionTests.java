import main.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTests {
    @Test
    void BasicMedianTest21() {
        Solution sol = new Solution();

        assertEquals(2.0000,sol.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }

    @Test
    void MedianTestSequential() {
        Solution sol = new Solution();
    
        assertEquals(2.5,sol.findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    @Test
    void MedianTestZeros() {
        Solution sol = new Solution();

        assertEquals(0.0000,sol.findMedianSortedArrays(new int[]{0,0}, new int[]{0,0}));
    }

    @Test
    void MedianTestEmptySingle() {
        Solution sol = new Solution();

        assertEquals(1.0000,sol.findMedianSortedArrays(new int[]{}, new int[]{1}));
    }

    @Test
    void MedianTestSingleEmpty() {
        Solution sol = new Solution();

        assertEquals(2.0000,sol.findMedianSortedArrays(new int[]{2}, new int[]{}));
    }
}
