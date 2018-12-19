package java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstFindAnyStreamsOperationExample {

    /**
     * findAny() and findFirst() both are short-circuiting terminal operations,
     * returns an Optional if element found or Empty Optional if Stream is empty
     * findFirst() returns first element matched from the Stream's element
     * findAny() returns the any matched element from the Stream
     * Both works same in Sequential processing i.e returns the first matched element
     * But in parallel operations findAny() works better in performance
     */

    public static void main(String[] args) {
        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "gymnastics","soccer","dancing","football");

        /**
         * Example 01
         * we will search an element using findAny()
         */
        System.out.println("Example 01");
        Optional<String> isFoundAnyStringOptional =  activitiesList.stream()
                .filter(s -> s.equals("dancing"))
                .findAny();
        isFoundAnyStringOptional.ifPresent(s ->
                        System.out.println("found by findAny(): " + isFoundAnyStringOptional.get())
        );

        /**
         * Example 02
         * Now we will search an element using findFirst()
         */
        System.out.println("Example 02");
        Optional<String> isFoundFirstStringOptional =  activitiesList.stream()
                .filter(s -> s.equals("dancing"))
                .findFirst();
        isFoundFirstStringOptional.ifPresent(s ->
                System.out.println("found by findFirst(): " + isFoundFirstStringOptional.get())
        );
    }
}
