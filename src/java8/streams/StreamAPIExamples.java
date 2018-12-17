package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIExamples {

    /**
     * Stream API introduced in java8, performs operations on collections of objects
     * Can be used with Java Collections, Arrays, and IO channels
     * Operations can be parallel and sequential, parallel operations are much easier with stream api
     * Stream can have multiple intermediate operations, each intermediate operation returns a stream
     * There must be a terminal operation at the end of stream
     * In stream intermediate operations are lazy,
     * this means if there is no terminal operation in the steam intermediate operations will not be executed
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * In this example we are going to get Student names and their activates
         * Data will be used from StudentDatabase Class which is located under data package
         */
        System.out.println("Example 01");
        Map<String, List<String>> studentsDataMap = StudentDataBase.getAllStudents()
                .stream()
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentsDataMap);

        /**
         * Example 02
         * In this example we will apply some filters on students list
         * Data will be used from StudentDatabase Class which is located under data package
         */
        System.out.println("Example 02");
        Map<String, List<String>> studentsFilterDataMap = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGpa() == 4)
                .collect(Collectors.toMap(Student::getName,Student::getActivities));
        System.out.println(studentsFilterDataMap);

        /**
         * Example 03
         * Let's see another example of filters
         */
        System.out.println("Example 03");
        List<String> stringList = Arrays.asList("Java8", "Lambda","Stream", "Students");
        List<String> filteredStringList =  stringList.stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        //strings which are starting with letter 'S' will be printed
        System.out.println(filteredStringList);
    }
}

