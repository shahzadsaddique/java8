package java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamAPIFactoryMethodExamples {

    /**
     * There are three factory methods on Stream API.
     * Of() : this is a static method, used to create a stream of values passed to this method
     * iterate() & generate() : both are static and infinite methods
     * iterate(): is used to iterate over any expression for infinite time to create infinite, initial value is supplied and limit() is also required to stop it iteration
     * generate(): takes a object supplier and used to create infinite stream of objects
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * of() factory method
         * Here we will use to create a stream of String objects
         */
        Stream<String> stringStream = Stream.of("Adam","Jenny","Emily","Dave");
        stringStream.forEach(System.out::println);

        /**
         * Example 02
         * iterate() takes two parameters, 1st initial value, 2nd expresion
         * iterates of 2nd expresion for infinite time
         * limit() is used to stop iterate()
         */
        Stream.iterate(1, integer -> integer * 2)
                .limit(10)
                .forEach(System.out::println);

        /**
         * Example 03
         * generate() is used to create infinite stream of objects using Supplier interface
         * limit() is used to stop it
         */
        Supplier<Integer> integerSupplier  = new Random()::nextInt;
        Stream.generate(integerSupplier)
                .limit(10)
                .forEach(System.out::println);
    }
}
