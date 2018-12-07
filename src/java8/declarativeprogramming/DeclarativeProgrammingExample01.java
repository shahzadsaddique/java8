package java8.declarativeprogramming;

import java.util.stream.IntStream;

public class DeclarativeProgrammingExample01 {

    public static void main(String [] args){

        /*
        * Imperative Vs Declarative Programming
        *
        * Have a look on a very simple example of adding 0 - 100 numbers in both styles
        */

        /*
        * Imperative style programming
        * In this paradigm/mood we focus on "How to Do"
        * OR simply we focus on logic that how to solve the problem
        */
        int sum = 0;
        for (int i=0; i<= 100; i++ ){
            sum+=i;
        }
        System.out.println("Sum calculated in Imperative style: " + sum);


        /*
        * Declarative style programming
        * In this approach we focus on what to get,
        * Or simply our concerns is Results not logic, we don't look what's happening behind the walls
        * In declarative style we just have to find and call pre-define/built-in functions
        * Declarative style is just like SQL
        * */
        int sum1 = IntStream.range(0,100).
                sum();
        System.out.println("Sum calculated in Declarative style: " + sum1);

    }
}

