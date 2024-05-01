package com.lab.consumer;

import com.lab.service.EvaluateNumber;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ServiceLoader;

public class Main {


    public static void main(String[] args) {

        ServiceLoader<EvaluateNumber> loader = ServiceLoader.load(EvaluateNumber.class);

        var implementations = new ArrayList<EvaluateNumber>();
        var implementationNames = new ArrayList<String>();

        for (EvaluateNumber eval : loader) {
            implementations.add(eval);
            implementationNames.add(eval.getClass().getSimpleName());
        }

        if (implementations.isEmpty()) {
            System.out.println("No implementations found.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available implementations:");
        for (int i = 0; i < implementationNames.size(); i++) {
            System.out.println((i + 1) + ". " + implementationNames.get(i));
        }

        System.out.print("Choose an implementation (1-" + implementationNames.size() + "): ");
        int choice = scanner.nextInt();

        if (choice < 1 || choice > implementationNames.size()) {
            System.out.println("Invalid choice.");
            return;
        }

        EvaluateNumber selectedImplementation = implementations.get(choice - 1);

        System.out.print("Enter a number to evaluate: ");
        int number = scanner.nextInt();

        System.out.println("Result: " + selectedImplementation.evaluate(number));
    }

}
