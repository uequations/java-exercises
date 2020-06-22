package com.uequations.compute;

public final class Palindrome {
    private Palindrome() {
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static boolean checkPalindrome(String str) {
        if (str == null || str.length() <= 1)
            return true;

        return str.equalsIgnoreCase(reverseString(str));
    }


}
