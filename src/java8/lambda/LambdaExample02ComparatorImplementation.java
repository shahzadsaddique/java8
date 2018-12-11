package java8.lambda;

import java.util.Comparator;

public class LambdaExample02ComparatorImplementation {

    public static void main(String[] args) {
        /**
         * Old java Comparator Implementation
         */

        /** Example 01
         *  Create a Comparator object and implement it's compare() method
         */
        Comparator<Integer> comparatorRef = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        //test this Comparator
        System.out.println("Legacy Implemented Comparator result: " + comparatorRef.compare(1,3));


        /** Example 02
         * Lambda java8 Comparator Implementation
         * Create a Comparator object with Lambda
         */
        Comparator<Integer>  comparatorLambdaRef1 = (Integer a, Integer b ) -> {
            return  a.compareTo(b);
        };
        //test this Comparator
        System.out.println("Lambda Implemented Comparator result: " + comparatorLambdaRef1.compare(5,1));


        /** Example 03
         * Simplify above example
         */
        Comparator<Integer>  comparatorLambdaRef2 = (a, b) -> a.compareTo(b);
        //test this Comparator
        System.out.println("Lambda Implemented Simplified Comparator result: " + comparatorLambdaRef2.compare(5,5));

    }
}
