package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterReduceStreamOperationExamples {
    
    /**
     * filter() and reduce() both are Stream operations
     * filter(): is an intermediate operation, accepts a Predicate as input to filter the Stream elements and
     * returns a stream of filtered elements
     * reduce(): is a terminal operation, perform reduction on stream elements to produce a single resultant,
     * accepts Binary operator as accumulator, combine or operate the stream in such a way that it
     * returns only a single value usually an Optional of type T
     */

    public static void main(String[] args) {

        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "gymnastics","soccer","dancing","football");

        /**
         * Example 01
         * We will perform a filter operation on the activitiesList
         */
        System.out.println("Example 01");
        List<String> filteredActivities = activitiesList.stream()
                .filter(s -> s.endsWith("l")) //applying a filter on stream, this will pass only strings ends with "l"
                .collect(Collectors.toList());
        System.out.println("filter() result: " + filteredActivities);

        /**
         * Example 02
         * Now we will test reduce operation
         * The result of reduce() will be an Optional
         * we will concat all the activates in the activitiesList to a single String
         */
        System.out.println("Example 02");
        Optional<String> concatenatedStringsOptional = activitiesList.stream()
                .reduce(String::concat); //OR can be written as => reduce((s, s2) -> s.concat(s2));

        //if the optional result is not empty print it
        concatenatedStringsOptional.ifPresent( s ->
                System.out.println("reduce() result: " + s)
        );


        /**
         * Example 02
         * Now we will use both filter() and reduce() together
         * We will count the number of notebooks of female students
         * Student's data will be used form StudentDatabase Class
         * Result will be in Optional Integer because we are counting the number of books
         */
        Optional<Integer> numberOfBooksOptional = StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender() == "female") //filtering the "female" students only
                .map( Student::getNoteBooks) //creating a stream of number of notebooks
                .reduce((integer, integer2) -> integer + integer2); //reducing the stream into Optional Integer by adding them

        numberOfBooksOptional.ifPresent(integer ->
                System.out.println("Number of notebooks of female students: " + numberOfBooksOptional.get())
        );


    }
}
