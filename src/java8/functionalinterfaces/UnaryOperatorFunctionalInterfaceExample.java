package java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceExample {

    /**
     * UnaryOperator is a functional interface which extends Function interface, Introduced in java8
     * Accepts one input and return the same type of value as output
     * We can use this interface instead of Function, where we know that input and output are going to be of same type
     */

    public static void main(String[] args) {

        //creating a simple UnaryOperator which accept integer as input, and returns integer
        UnaryOperator<Integer> integerUnaryOperator = num -> num * num;
        System.out.println("Result of integerUnaryOperator is: " + integerUnaryOperator.apply(5));
     }
}
