package com.luv2code.tdd;

public class FizzBuzz {

    // If a number is divisible by 3 print Fizz
    // If a number is divisible by 5 print Buzz
    // If a number is divisible by 3 and 5 print FizzBuzz
    // If a number is NOT divisible by 3 and 5 print the number

    public static String compute(int i) {
        if ((i % 3 == 0) && (i % 5 == 0)) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(i);
        }
    }
}
