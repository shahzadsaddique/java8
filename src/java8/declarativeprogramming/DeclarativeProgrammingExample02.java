package java8.declarativeprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DeclarativeProgrammingExample02 {

    public static void main(String[] args) {

        /*
         * Imperative Vs Declarative Programming
         *
         * Have a look on the example of "Removing duplicate numbers from the list"
         */

        List<Integer> duplicateNumbersList = Arrays.asList(1,1,2,2,3,4,3,5,4,6,7,7,8,9,9,10);


        /*
         * Imperative style programming
         */
        List<Integer> uniqueNumbersList = new ArrayList<>();
        for(Integer integer : duplicateNumbersList){
            if(!uniqueNumbersList.contains(integer)){
                uniqueNumbersList.add(integer);
            }
        }
        System.out.println("Unique numbers list from Imperative style: " + uniqueNumbersList);


        /*
         * Declarative style programming
         */
        List<Integer> duplicateNumbersList1 =  duplicateNumbersList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique numbers list from Declarative style: " + duplicateNumbersList1);

    }
}
