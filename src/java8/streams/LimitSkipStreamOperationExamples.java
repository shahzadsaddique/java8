package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LimitSkipStreamOperationExamples {

    /**
     * limit() and skip() both are intermediate Stream operations
     * limit(): accepts a long:n as input and returns a Stream of first n elements
     * skip(): accepts a long:n as input skips the first n elements and returns a Steam if remaining elements
     */

    public static void main(String[] args) {

        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "gymnastics","soccer","dancing","football");
        /**
         * Example 01
         * We will perform toUpperCase operation on first 3 elements on the activitiesList
         *
         */
        System.out.println("Example 01");
        List<String> limitResultList =  activitiesList.stream()
                .limit(3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //You can notice only first 3 elements operated
        System.out.println("limit() result: " + limitResultList);

        /**
         * Example 02
         * We will perform toUpperCase operation on elements except first 3 of activitiesList
         *
         */
        System.out.println("Example 02");
        List<String> skipResultList =  activitiesList.stream()
                .skip(3)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        //You can notice only last 4 elements operated
        System.out.println("skip() result: " + skipResultList
        );

        /**
         * Example 03
         * We will perform both limit() and skip() on activitiesList to preform operation on middle elements
         */
        System.out.println("Example 03");
        List<String> limitSkipResultsList =  activitiesList.stream()
                .limit(4)
                .skip(2)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("limit() and skip() result: " + limitSkipResultsList
        );
    }
}
