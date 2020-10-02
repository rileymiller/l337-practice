import main.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTest {
    @Test
    void BasicParensTest() {
        Solution sol = new Solution();

        assertEquals(true, sol.isValid("()"));
    }

    @Test
    void MismatchTest() {
        Solution sol = new Solution();

        assertEquals(false, sol.isValid("(]"));
    }

    @Test
    void SingleCharTest() {
        Solution sol = new Solution();

        assertEquals(false, sol.isValid("("));
    }

    @Test
    void ComplexMismatchTest() {
        Solution sol = new Solution();

        assertEquals(false, sol.isValid("([)]"));
    }

    @Test
    void OrderedCharsTest() {
        Solution sol = new Solution();

        assertEquals(true, sol.isValid("{[]}"));
    }

    @Test
    void ImmediateClosedCharsTest() {
        Solution sol = new Solution();

        assertEquals(true, sol.isValid("()[]{}"));
    }
}
