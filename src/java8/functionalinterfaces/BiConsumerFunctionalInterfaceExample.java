package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerFunctionalInterfaceExample {

    /**
     * BiConsumer is the Functional Interface exactly same as Consumer Interface except it takes two arguments, while Consumer takes one argument
     * Introduced in java 8
     * In the examples below Lambda is used to implement this interface
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * Have a look on a simple example, where we will demonstrate BiConsumer with 2 arguments
         */
        System.out.println("Example 01:");
        BiConsumer<String, String> consumerStr = (str1, str2) -> System.out.println("BiConsumer have two arguments, which are '" + str1 + "' and '" + str2 + "'");
        consumerStr.accept("argu1", "argu2");

        /**
         * Example 02
         * In this example we will use Data from StudentDataBase class
         * We are going to print Student's Name and Student's activates, both in a single function
         */
        System.out.println("Example 02:");
        printNamesAndActivates();

        /**
         * Example 03
         * In this example we will perform sum magnetically operations
         */
        System.out.println("Example 03:");
        BiConsumer<Integer, Integer> additionBiConsumer = (num1,num2) -> System.out.println("Sum is: " + (num1 + num2));
        additionBiConsumer.accept(10,10);

        BiConsumer<Integer, Integer> multiplicationBiConsumer = (num1,num2) -> System.out.println("Multiplication  is: " + (num1 * num2));
        multiplicationBiConsumer.accept(3,5);

        //we can use them together by using "andThen"
        additionBiConsumer.andThen(multiplicationBiConsumer).accept(5,5);
    }

    private static void printNamesAndActivates() {
        //Get the list of all students
        List<Student> studentsList = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> studentsConsumer =  (name,activities) -> System.out.println("Name: " + name + " | Activities: " + activities);
        studentsList.forEach(student -> studentsConsumer.accept(student.getName(),student.getActivities()));
    }
}
