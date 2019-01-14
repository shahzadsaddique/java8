package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class CollectorsStreamOperationExamples {

    /**
     * Collector class has many usefully pre-defined static operations that can be use in collect() terminal operation
     * joining() => Combines value/values from stream elements and returns a string. A delimiter, prefix and suffix also can be passed.
     * counting() => Used to count values from stream elements, filters can also be applied to get required results
     * mapping() => Used to map values from stream elements to any collection type
     * minBy() => Used to find min value stream element using comparator
     * maxBy() => Used to find max value stream element using comparator
     * summingInt() => Used to find sum of Int values in stream elements
     * averagingInt() => Used to calculate average of any values in the stream elements
     * groupingBY() => This operation is same as SQL groupBy, used to group stream elements by any value classifications,
     * more then one classifications, filters or any other Collector operation can be combined, also we can specify output collections type
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * joining() => we will use this operation to join student names
         */
        System.out.println("Example 01");
        String studentNames = StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-"));
        System.out.println("students names joined by joining(): " +  studentNames);


        /**
         * Example 02
         * counting() => we will count the students having GPA more then 3.5
         */
        System.out.println("Example 02");
        Long studentsCount = StudentDataBase.getAllStudents()
                .stream()
                .filter(student -> student.getGpa() > 3.5)
                .collect(counting());
        System.out.println("student that have GPA more then 3.5: " +  studentsCount);

        /**
         * Example 03
         * mapping()= > We will convert Students names list into a set
         */
        System.out.println("Example 03");
        Set<String> studentsNamesSet = StudentDataBase.getAllStudents()
                .stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println("students names as set: " +  studentsNamesSet);

        /**
         * Example 04
         * minBy()= > We will find student with min GPA
         */
        System.out.println("Example 04");
        Optional<Student> minGPAStudent = StudentDataBase.getAllStudents()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
        System.out.println("student with min GPA: " +  minGPAStudent);

        /**
         * Example 05
         * maxBy()= > We will find student with max GPA
         */
        System.out.println("Example 05");
        Optional<Student> maxGPAStudent = StudentDataBase.getAllStudents()
                .stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
        System.out.println("student with max GPA: " +  maxGPAStudent);

        /**
         * Example 06
         * groupingBY() => we will get students in different groups, depending upon classifications
         */
        System.out.println("Example 06");
        Map<Integer, List<Student>> studentGroupByGrade = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel));
        System.out.println("student grouped by grade: " +  studentGroupByGrade);

        Map<Integer, Optional<Student>> studentGroupByGradeAndGPA = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println("student grouped by grade and then min GPA: " +  studentGroupByGradeAndGPA);

    }
}
