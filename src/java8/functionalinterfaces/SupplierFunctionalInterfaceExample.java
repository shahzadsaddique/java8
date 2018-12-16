package java8.functionalinterfaces;

import java.util.function.Supplier;

public class SupplierFunctionalInterfaceExample {

    /**
     * Supplier is a Functional InterfaceExample introduced in java8
     * It takes no input and returns a value of type T
     * It has only one abstract method "get()"
     * This interface is inverted version of Consumer which takes one argument and return nothing
     */

    public static void main(String[] args) {

        //create an object of Supplier interface, which will return a String object
        Supplier<String> stringSupplier =  () -> "This string is return by stringSupplier";
        System.out.println(stringSupplier.get());
    }
}
