package com.uequations.compute;

public class JavaAlmostValidator {

    public static void main(String[] args) {

        String almostPalindromeStr = "abca";

        System.out.format("solution: %s", solve(almostPalindromeStr));
    }

    private static String solve(String inputStr) {

        if (null == inputStr) {
            throw new IllegalArgumentException("C'mon.  It's null, Man!");
        }

        if (Palindrome.checkPalindrome(inputStr)) {
            return inputStr;
        } else {


            for (int i = 0; i < inputStr.length(); i++) {

                StringBuilder sb = new StringBuilder(inputStr);

                String tmp = sb.deleteCharAt(i).toString();

                if (Palindrome.checkPalindrome(tmp)) return tmp;
            }
            return "nope";
        }
    }
}
