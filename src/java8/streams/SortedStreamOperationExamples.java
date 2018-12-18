package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamOperationExamples {

    /**
     * sorted() is an intermediate stream operations, used to sort elements in the stream
     * Elements can be sorted either natural order or using Comparator
     * We can also reverse the sorted elements to sort them ASC and DSC orders
     */

    public static void main(String[] args) {

        List<String> activitiesList = Arrays.asList("swimming","basketball","volleyball",
                "gymnastics","soccer","dancing","football");
        /**
         * Example 01
         * We are going to sort this activitiesList in natural order by stream Sorted method
         */
        System.out.println("Example 01");
        List<String> sortedActivitiesList = activitiesList.stream()
                .sorted() //this will sort the list in natural order i.e in alphabet order
                .collect(Collectors.toList());
        System.out.println("Natural sorted list: " + sortedActivitiesList);

        /**
         * Example 02
         * We are going to sort this activitiesList in reverse order by stream Sorted method
         */
        System.out.println("Example 02");
        List<String> reverseSortedActivitiesList = activitiesList.stream()
                .sorted(Comparator.reverseOrder()) //this will sort the list in reverse order
                .collect(Collectors.toList());
        System.out.println("Reverse order sorted list: " + reverseSortedActivitiesList);

        /**
         * Example 03
         * Now we will look how to sort list of custom objects
         * we can sort list of custom objects by using Comparator
         * We are going to sort list of Students by their name
         * Student's data will be used form StudentDatabase Class
         */
        System.out.println("Example 03");
        List<Student> studentList = StudentDataBase.getAllStudents();
        List<Student> sortedStudentList = studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
        System.out.println("Students sorted by name: " );
        sortedStudentList.forEach(System.out::println);
    }
}
