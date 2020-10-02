package main;

public class Solution {
    public boolean isPalindrome(int x) {
        String convInt = Integer.toString(x);

        for(int i = 0; i < convInt.length() / 2; i++){
            if(convInt.charAt(i) != convInt.charAt(convInt.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }
}
