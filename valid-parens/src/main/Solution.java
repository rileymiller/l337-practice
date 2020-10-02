package main;

import java.util.*;

public class Solution {
    private Stack<Character> lhs = new Stack<>();
    private Character[] lhsChars = new Character[]{new Character('('), new Character('['), new Character('{') };
    private Character[] rhsChars = new Character[]{new Character(')'), new Character(']'), new Character('}') };
    private Set<Character> validLHS = new HashSet<>(Arrays.asList(lhsChars));
    private static Map<Character, Character> validCharMap = new HashMap<>();

    private static void initialize() {
        validCharMap.put('(', ')');
        validCharMap.put('{', '}');
        validCharMap.put('[', ']');
    }
    public Solution() {
        initialize();
    }
    public boolean isValid(String s) {

        for (int i = 0; i < s.length(); i++) {
            if(validLHS.contains(s.charAt(i))) {
                lhs.push(s.charAt(i));
            } else {
                try {

                   Character topLHS = lhs.peek();
                   if(validCharMap.get(topLHS) == s.charAt(i)) {
                       lhs.pop();
                       continue;
                   } else {
                       return false;
                   }
                } catch (EmptyStackException e) {
                    return false;
                }
            }
        }

        if(lhs.size() > 0) return false;
        return true;
    }
}
