import main.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    void BasicPalindromeTest121() {
        Solution sol = new Solution();

        assertEquals(true,sol.isPalindrome(121));
    }

    @Test
    void BasicPalindromeTest11() {
        Solution sol = new Solution();

        assertEquals(true,sol.isPalindrome(11));
    }

    @Test
    void BasicPalindromeTest10() {
        Solution sol = new Solution();

        assertEquals(false,sol.isPalindrome(10));
    }

    @Test
    void BasicPalindromeTestNeg121() {
        Solution sol = new Solution();

        assertEquals(false,sol.isPalindrome(-121));
    }

    @Test
    void BasicPalindromeTest1001() {
        Solution sol = new Solution();

        assertEquals(true,sol.isPalindrome(1001));
    }

}
