package com.lab.provider;

import com.lab.service.EvaluateNumber;

public class OddNumber implements EvaluateNumber {
    @Override
    public String evaluate(int number) {
        if (number % 2 != 0) {
            return "Yes!! " + number + " is an odd number";
        } else {
            return "...";
        }
    }
}
