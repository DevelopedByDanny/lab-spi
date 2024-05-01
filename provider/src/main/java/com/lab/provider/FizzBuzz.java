package com.lab.provider;

import com.lab.service.EvaluateNumber;

public class FizzBuzz implements EvaluateNumber {
    @Override
    public String evaluate(int number) {
        System.out.println("In FizzBuzz class, evaluate method is called with the number " + number);
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return number + " is not Fizz or Buzz and definitely not FizzBuzz";
        }
    }
}
