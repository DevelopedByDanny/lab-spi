package com.lab.provider;

import com.lab.service.ClassInfo;
import com.lab.service.EvaluateNumber;
@ClassInfo(name = "OddNumber evaluator")
public class Odd implements EvaluateNumber {
    @Override
    public String evaluate(int number) {
        if (number % 2 != 0) {
            return "Yes!! " + number + " is an odd number";
        } else {
            return "...";
        }
    }
}
