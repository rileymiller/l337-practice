import com.l337.src.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class SolutionTests {
    @Test
    void BaseTest() {
        Solution sol = new Solution();

        assertEquals(42,sol.myAtoi("42"));
    }

    @Test
    void WhiteSpaceTest() {
        Solution sol = new Solution();

        assertEquals(42,sol.myAtoi("         42"));
    }

    @Test
    void MinusTest() {
        Solution sol = new Solution();

        assertEquals(-42, sol.myAtoi("-42"));
    }

    @Test
    void WhiteSpaceMinusTest() {
        Solution sol = new Solution();

        assertEquals(-42, sol.myAtoi("         -42"));
    }

    @Test
    void PlusTest() {
        Solution sol = new Solution();

        assertEquals(42, sol.myAtoi("42"));
    }

    @Test
    void WhiteSpacePlusTest() {
        Solution sol = new Solution();

        assertEquals(42, sol.myAtoi("        42"));
    }

    @Test
    void AlphaPrefixTest() {
        Solution sol = new Solution();

        assertEquals(0, sol.myAtoi("words and 987"));
    }

    @Test
    void AlphaSuffixTest() {
        Solution sol = new Solution();

        assertEquals(4193, sol.myAtoi("4193 with words"));
    }

    @Test
    void IntMin() {
        Solution sol = new Solution();

        assertEquals(Integer.MIN_VALUE, sol.myAtoi("-91283472332"));
    }

    @Test
    void IntMax() {
        Solution sol = new Solution();

        assertEquals(Integer.MAX_VALUE, sol.myAtoi("91283472332"));
    }

    @Test
    void StringToIntSuffix() {
        Solution solution = new Solution();

        assertEquals(4132, solution.stringToInt("4132wordshere"));
    }

    @Test
    void StringToIntWhiteSpaceNum() {
        Solution sol = new Solution();

        assertEquals(42, sol.stringToInt("42"));
    }

    @Test
    void StringToIntSplitInput() {
        Solution sol = new Solution();

        assertEquals(0, sol.stringToInt("   +0 123"));
    }
}
