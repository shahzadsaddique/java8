package java8.methodreferences;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferencesExamples {

    /**
     * Method reference is way to simplify the implementation of Functional Interface, Introduced in java8
     * They are shorthand syntax of Lambda expressions
     * We can use them to replace Lambda expressions, and we here don't need to pass the arguments manually,
     * If the method accepts arguments they passed automatically behind the scenes
     * Syntax of Method references is
     *      ClassName :: methodName
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * Let's see a very simple example implementing Consumer Interface
         * You will notice we are the same thing with Lambda and with a Method reference
         */
        System.out.println("Example 01");
        //using Lambda expression
        Consumer<String> printStringViaLambda = str -> System.out.println(str);
        printStringViaLambda.accept("Printing a string using Lambda!");

        //Now we are going to do the same thing with Method reference
        Consumer<String> printStringViaMethodRef = System.out::println;
        printStringViaMethodRef.accept("Printing a string using Method Reference!");


        /**
         * Example 02
         * Now have a look on an other example, we will pas an argument to method, and method will also return some value
         * For this we are going to implement Function interface
         */
        System.out.println("Example 02");
        //using Lambda expresion
        Function<String,String> strFunctionViaLambda = s -> s.toUpperCase();
        System.out.println(strFunctionViaLambda.apply("converting to uppercase via lambda!"));

        //using Method reference
        Function<String,String> strFunctionViaMethodRef = String::toUpperCase;
        System.out.println(strFunctionViaMethodRef.apply("converting to uppercase via Method Reference!"));

        /**
         * Example 03
         * Let's see another example from Student Class
         * We will print student's activities by calling a Method of Student class
         */
        System.out.println("Example 03");
        System.out.println("using Lambda");
        //using lambda to a call a method of object/class
        Consumer<Student> studentConsumerLambda = student -> student.printListOfActivities();
        StudentDataBase.getAllStudents().forEach(studentConsumerLambda);

        System.out.println("using Method Reference");
        //do the same thing using Method Reference
        Consumer<Student> studentConsumerMethodRef = Student::printListOfActivities;
        StudentDataBase.getAllStudents().forEach(studentConsumerMethodRef);
    }
}
