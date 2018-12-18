package java8.streams;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMapStreamOperationExamples {

    /**
     * Stream has many operations to perform on collection of objects
     * map(): map function takes a function as input and apply it on the given object and transfer it into other object,
     * and returns the stream consist of results
     * flatMap(): flatMap work on Collections of Collections i.e List of list, accepts a function as input apply it on given data,
     * and returns one or more values
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * map() implementation
         * We are going to fetch student names from Student's list and perform an toUpperCase operation
         * Student's data will be use from StudentDatabase class
         */
        System.out.println("Example 01");
        //getting list of names and printing it
        System.out.println(
                getListofNames(StudentDataBase.getAllStudents())
        );

        /**
         * Example 02
         * flatMap() implementation
         * We are going to fetch student activities list for each Student from Student's data and collect them in a single list
         * Student's data will be use from StudentDatabase class
         */
        System.out.println("Example 02");
        //getting list of Activities of all students and printing it
        //this will display a list of activities combined of all students, this may have duplicate data
        System.out.println(
                getListofActivities(StudentDataBase.getAllStudents())
        );
    }

    //Example 01
    //We used intermediate functions map() two times to get Names and to perform toUpperCase operation
    //At the end we used a terminal method collect to convert data into list
    private static List<String> getListofNames(List<Student> allStudents) {
        return allStudents.stream()
                .map(Student::getName) //this will get names from each Student object
                .map(String::toUpperCase) //this will convert Student's name to uppercase
                .collect(Collectors.toList()); //here all the names will be collected as a list
    }

    //Example 02
    //Here we used an intermediate function map() to collect Activities from Student Object
    //Then we we used an other intermediate function flatMap() to convert List of list into a single list
    private static List<String> getListofActivities(List<Student> allStudents) {
        return  allStudents.stream()
                .map(Student::getActivities) //getting list of activities from each Student Object
                .flatMap(List::stream) //converting list into single stream of string
                .collect(Collectors.toList());
    }
}