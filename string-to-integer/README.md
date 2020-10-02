#  String to Integer (atoi)

[Leet Code Problem](https://leetcode.com/problems/string-to-integer-atoi/)

Implement `atoi` which converts a string to an integer.

The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.

The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

**Note:**

* Only the space character ' ' is considered as whitespace character.
* Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.


Used a combination of regex and `BigInteger` for this one.

Algorithm is broken down into:
- Trim leading whitespace
- Capture number group with regex (this could've been refined to account for the leading whitespace)
- Check if the string to integer conversion would result in a value larger than a 32 bit signed integer (in Java `Integer.MAX_VALUE` and `Integer.MIN_VALUE`) with `BigInteger.compareTo`.

### Regex for Digits && +/-
```java 
        String validNumberChars = "(^[+\\-]?\\d+).*";
        Pattern pattern = Pattern.compile(validNumberChars);
        Matcher digitMatch = pattern.matcher(str);

        String capturedDigit;
        if(digitMatch.find()){

            capturedDigit = digitMatch.group(1);

        } else{
            return 0;
        }
```

In Java, you use the `Pattern` and `Matcher` classes to compile and match RegEx.

```java
        String validNumberChars = "(^[+\\-]?\\d+).*";
        Pattern pattern = Pattern.compile(validNumberChars);
        Matcher digitMatch = pattern.matcher(str);
```

To match a RegEx in Java, 

1. Define the pattern in a string
2. Compile the string pattern using the `Pattern` class
3. Store result of `Pattern` `matcher()` method in a `Matcher` instance 

### Complexity
**O(n)**?
