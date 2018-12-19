package java8.streams;

import java.util.Arrays;
import java.util.List;

public class AnyMatchAllMatchOperationExamples {

    /**
     * anyMatch(), allMatch() and noneMatch() all of these are short-circuiting terminal operations, they ll return false if Stream is empty
     * anyMatch(): accepts a Predicate as input and returns true or false i.e either the element match with any of stream elements or not
     * allMatch(): accepts a Predicate as input, returns true if all elements in the Stream are same as test Predicate
     * noneMatch(): accepts a Predicate and returns true if none of the elements in the Stream match with tested element
     */

    public static void main(String[] args) {
        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "swimming","gymnastics","soccer","swimming","gymnastics","soccer",
                "dancing","football","volleyball","basketball","football","dancing");

        /**
         * Example 01
         * we are going to test anyMatch on activitiesList
         */
        System.out.println("Example 01");
        boolean isElementFound = activitiesList.stream()
                .anyMatch(s -> s.endsWith("swimming"));
        System.out.println("anyMatch(): 'swimming' element found : " + isElementFound);

        /**
         * Example 02
         * we are going to test allMatch on activitiesList
         */
        System.out.println("Example 02");
        boolean allElementsFound = activitiesList.stream()
                .allMatch(s -> s.endsWith("swimming"));
        System.out.println("allMatch(): 'swimming' is matched with all elements: " + allElementsFound);

        /**
         * Example 03
         * we are going to test noneMatch on activitiesList
         */
        System.out.println("Example 03");
        boolean noneElementFound = activitiesList.stream()
                .noneMatch(s -> s.endsWith("swimming"));
        System.out.println("noneMatch(): 'swimming' is not matched with any elements: " + noneElementFound);

    }
}
