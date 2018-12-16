package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionFunctionalInterfaceExample {

    /**
     * BiFunction is a Functional Interface similar to Function Interface, The difference in these two is,
     * it accepts two arguments while Function interface takes one argument
     * Introduced in java8
     */

    public static void main(String[] args) {

        /**
         * Example 01
         * We will implement BiFunction Interface to get a HashMap containing Student's Names and Activities based on a predicate filter
         * Two arguments will be:  1. Students list, 2. An implementation of Predicate interface to filter the results
         */

        //creating a BiFunction which takes 2 inputs and returns a HashMap
        BiFunction<List<Student>, Predicate<Student>, HashMap<String,List<String>>> studentsFilterBiFunction = (students, studentPredicate) -> {
            HashMap<String,List<String>> studentsHashMap = new HashMap<>();
            students.forEach(student -> {
                if(studentPredicate.test(student))
                    studentsHashMap.put(student.getName(),student.getActivities());
            });
            return studentsHashMap;
        };

        //creating a Predicate to pass BiFunction
        Predicate<Student> studentPredicate =  student -> student.getGradeLevel() >= 3;

        System.out.println(studentsFilterBiFunction.apply(StudentDataBase.getAllStudents(),studentPredicate));
    }
}
