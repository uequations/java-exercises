package com.uequations;

import com.uequations.compute.UsernameValidator;

//  Sample data:
//      Julia
//      Samantha
//      Samantha_21
//      1Samantha
//      Samantha?10_2A
//      JuliaZ007
//      Julia@007
//      _Julia007
public class JavaUsernameValidator {


    public static void main(String[] args) {
        String username = "Julia";
        System.out.println(solve(username));
    }

    public static boolean solve(String _username) {

        if (_username.matches(UsernameValidator.regularExpression)) {
            System.out.println("Valid");
            return true;
        } else {
            System.out.println("Invalid");
            return false;
        }
    }
}

