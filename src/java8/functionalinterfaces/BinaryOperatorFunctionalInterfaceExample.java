package java8.functionalinterfaces;

import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceExample {

    /**
     * BinaryOperator is a functional interface which extends BiFunction interface, Introduced in java8
     * Accepts 2 inputs and return the same type of value as output
     * We can use this interface instead of BiFunction, where we know that both inputs and output are going to be of same type
     */

    public static void main(String[] args) {
        //creating a simple BinaryOperator which accepts two integers as input, and returns an integer\
        BinaryOperator<Integer> integerBinaryOperator = (num1, num2) ->  num1 * num2;

        System.out.println("Result of integerBinaryOperator: " + integerBinaryOperator.apply(3,4));
    }
}
