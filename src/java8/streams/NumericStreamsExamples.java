package java8.streams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsExamples {

    /**
     * Numeric Streams used to deal with numerics, there are three specific numeric streams named "IntStream", "LongStream" and "DoubleStream"
     * Some common operations of Numeric Stream are range(), rangeClosed(), count(), forEach(),
     * sum(), max(), min(), average(), mapToObj(), mapToLong(), mapToDouble(), mapToInt()
     */

    public static void main(String[] args) {
        /**
         * Example
         */

       int sum = IntStream.rangeClosed(1,50)
                .sum();
        System.out.println("sum is: " + sum);

        IntStream.rangeClosed(1,7)
                .forEach(System.out::println);

        OptionalDouble average = IntStream.rangeClosed(1, 50)
                .average();
        System.out.println("average is : " + (average.isPresent() ? average.getAsDouble() : "failed to find average"));
    }
}
