package com.l337.src;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Solution {
    public int stringToInt(String str) {
        String validNumberChars = "(^[+\\-]?\\d+).*";
        Pattern pattern = Pattern.compile(validNumberChars);
        Matcher digitMatch = pattern.matcher(str);

        String capturedDigit;
        if(digitMatch.find()){

            capturedDigit = digitMatch.group(1);

        } else{
            return 0;
        }


        int parsedDigit;
        try{
            parsedDigit = Integer.parseInt(capturedDigit);
        } catch (NumberFormatException e) {
            BigInteger overUnder = new BigInteger(capturedDigit);
            if(overUnder.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0) {
                return Integer.MAX_VALUE;
            }
            else {
                return Integer.MIN_VALUE;
            }
        }
        return parsedDigit;
    }

    public int myAtoi(String str) {
        // Trim leading space
        str = str.trim();
        int convertedInt = stringToInt(str);

        return convertedInt;
    }
}
