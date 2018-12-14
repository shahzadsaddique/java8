package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateFunctionalInterfaceExample {

    /**
     * Predicate is a functional interface, introduces in java8, can be found in java.util.function package
     * Has one abstract method named "test" which accept one input, and returns boolean true/false
     * Also has three default methods "and", "or", and "negate"
     * We will use Lambda to explore Predicate interface
     *
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * A very simple example of Predicate interface
         * In this example we will check weather a number is divisible by 2 or not
         * Then we will add "and" , "or" and "negate" functions to see the difference
         */

        System.out.println("Example 01");
        //create a predicate to check weather the input number is divisible by 2 or not
        Predicate<Integer> divisibleBy2Predicate = (num) -> num%2 == 0;
        System.out.println("Result of 'divisibleBy2Predicate' is: " + divisibleBy2Predicate.test(10));

        //create an other predicate to check weather the input number is divisible by 5 or not
        Predicate<Integer> divisibleBy5Predicate = (num) -> num%5 == 0;

        //now use let's use them together with "and" , "or" and "negate" functions

        //and function => result will be true only if both results are true,
        System.out.println("Result of 'divisibleBy2Predicate' and 'divisibleBy5Predicate' is: " +
                divisibleBy2Predicate.and(divisibleBy5Predicate).test(10));

        //or function => result will be true if any one of the results is true
        System.out.println("Result of 'divisibleBy2Predicate' or 'divisibleBy5Predicate' is: " +
                divisibleBy2Predicate.or(divisibleBy5Predicate).test(7));

        //negate function => will negate the results, if they true converts then to false
        System.out.println("Result of 'divisibleBy2Predicate' negate 'divisibleBy5Predicate' is: " +
                divisibleBy2Predicate.and(divisibleBy5Predicate).negate().test(10));

        /**
         * Example 02
         * Let's see an other Example of filtering the Students,
         * we will get Students's data from StudentDatabase class which is placed under data package
         * We will apply both Gpa and Grade filters and also use "and" function
         */
        System.out.println("Example 02");
        filterStudentsOnGradeAndGpa();
    }

    //Example 02
    private static void filterStudentsOnGradeAndGpa() {
        //Get the list of all students
        List<Student> studentsList = StudentDataBase.getAllStudents();
        Predicate<Student> studentGradePredicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> studentGpaPredicate = student -> student.getGpa()  < 4;

        studentsList.forEach(student -> {
            if(studentGradePredicate.and(studentGpaPredicate).test(student))
                System.out.println(student.getName());
        });
    }

}