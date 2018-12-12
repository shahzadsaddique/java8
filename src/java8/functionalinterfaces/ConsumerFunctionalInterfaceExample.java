package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterfaceExample {

    public static void main(String[] args) {

        /**
         * Consumer is a Functional Interface having one abstract method named "Accept" which takes one argument, and has no return type
         * Also has one default method named "andThen"
         * Introduced in java 8
         * In the examples below Lambda is used to implement this interface
         */

        /**
         * Example 01
         * Have a look on a very simple Consumer Example
         * In this example consumer's "accept" method is implemented in a single statement
         */
        System.out.println("Example 01:");
        Consumer<String> consumerStr = (str) -> System.out.println(str.toUpperCase());
        consumerStr.accept("This is a simple consumer example.");


        /** Example 02
         * In this example we are going to use Data from Student class and Student Database class
         * Data classes can be found in data package
         * What we are going to do in this example is to print all Students Database record
         * Let see how we can do this
         */
        System.out.println("Example 02:");
        printAllStudentsData();

        /** Example 03
         * In this example we will look how to perform specific task on any attribute of object in a list of many object
         * For this we are going to show you the "Name" and the "Activities" of different students
         * Also we will look how to use "andThen" default method of Consumer Interface
         * You will notice "andThen" function works magically charming
         */
        System.out.println("Example 03:");
        printNamesAndActivities();

        /** Example 04
         * In the following example we will find how to implement filters on a list of objects, based on the attributes of the object
         * For this we will display All student's names based on grades and GPA
         */
        System.out.println("Example 04:");
        printNamesUsingGradesAndGpaFillers();
    }

    // Example 02
    static public void printAllStudentsData() {
        //Get the list of all students
        List<Student> students = StudentDataBase.getAllStudents();
        //Create a consumer to display the data of Student
        Consumer<Student> studentsConsumer = (student) -> System.out.println(student);
        //Pass this consumer to forEach function of list, to display data of All Students
        students.forEach(studentsConsumer);
    }

    // Example 03
    private static void printNamesAndActivities() {
        //Get the list of all students
        List<Student> students = StudentDataBase.getAllStudents();
        //Create a consumer to display Student's Name
        Consumer<Student> studentNameConsumer = (student) -> System.out.print(student.getName());
        //Create a consumer to display Student's Activities
        Consumer<Student> studentActivitiesConsumer = (student) -> System.out.println(student.getActivities());
        //Pass these consumers to forEach function of list, to display Name, and Activities
        students.forEach(studentNameConsumer.andThen(studentActivitiesConsumer));
    }

    // Example 04
    private static void printNamesUsingGradesAndGpaFillers() {
        //Get the list of all students
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if(student.getGradeLevel() >= 3 && student.getGpa() == 4)
                System.out.println(student.getName());
        });
    }


}
