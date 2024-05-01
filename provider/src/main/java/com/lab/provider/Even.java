package com.lab.provider;


import com.lab.service.ClassInfo;
import com.lab.service.EvaluateNumber;
@ClassInfo(name = "EvenNumber evaluator")
public class Even implements EvaluateNumber {
    @Override
    public String evaluate(int number) {
        if (number % 2 == 0) {
            return "Yes!! " + number + " is an even number";
        } else {
            return "...";
        }
    }

}
