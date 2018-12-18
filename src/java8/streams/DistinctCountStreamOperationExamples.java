package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountStreamOperationExamples {
    /**
     * Here in this example we will look how distinct() and count() operations work
     * distinct(): this is an intermediate stream operation, return stream of distinct elements
     * count(): intermediate stream operation, returns a Long value by counting the elements of stream
     */

    public static void main(String[] args) {

        //creating a list of different activities, list may have some duplicate values
        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "swimming","gymnastics","soccer","swimming","gymnastics","soccer",
                "dancing","football","volleyball","basketball","football","dancing");
        /**
         * Example 01
         * distinct() implementation example
         */
        System.out.println("Example 01");
        List<String> distinctActivitiesList = activitiesList.stream()
                .distinct()
                .collect(Collectors.toList());
        //Print the distinct list
        System.out.println("Distinct activities : "+  distinctActivitiesList);

        /**
         * Example 02
         * count() implementation example
         */
        System.out.println("Example 02");
        Long totalActivities = activitiesList.stream()
                .count();
        //Print the totalActivities value
        System.out.println("Total activities: " + totalActivities);

        /**
         * Example 03
         * Now we will use both distinct and count together, to count distinct values
         */
        System.out.println("Example 03");
        Long totalDistinctActivities = activitiesList.stream()
                .distinct()
                .count();
        //Print the totalActivities value
        System.out.println("Total distinct activities: " + totalDistinctActivities);
    }
}
