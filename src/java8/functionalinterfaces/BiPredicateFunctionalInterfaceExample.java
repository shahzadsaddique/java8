package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateFunctionalInterfaceExample {

    /**
     * BiPredicate is the Functional Interface similar to Predicate Interface except it takes two inputs, while Predicate takes one input
     * Introduced in java 8
     * In the examples below Lambda is used to implement this interface
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * We will use the same Student's data which we used in Predicate example
         * We will filter students using BiPredicate
         */
        System.out.println("Example 01");
        filterStudentsOnGradeAndGpa();
    }

    //Example 01
    private static void filterStudentsOnGradeAndGpa() {
        //Get the list of all students
        List<Student> studentsList = StudentDataBase.getAllStudents();
        BiPredicate<Integer, Double> filterStudentsBiPredicate = (grade, gpa) -> grade >=3 && gpa < 4;

        studentsList.forEach(student -> {
            if(filterStudentsBiPredicate.test(student.getGradeLevel(),student.getGpa()))
                System.out.println(student.getName());
        });
    }
}
