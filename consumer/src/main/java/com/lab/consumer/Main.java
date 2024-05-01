package com.lab.consumer;

import com.lab.service.EvaluateNumber;

import java.util.ServiceLoader;

public class Main {


    public static void main(String[] args) {

        ServiceLoader<EvaluateNumber> loader = ServiceLoader.load(EvaluateNumber.class);
        System.out.println("Services loaded: " + loader.stream().count());

        for (EvaluateNumber evaluateNumber : loader) {
            System.out.println(evaluateNumber.evaluate(10));
        }
    }
}
