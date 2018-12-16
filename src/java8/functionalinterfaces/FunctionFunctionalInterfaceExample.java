package java8.functionalinterfaces;

import java8.data.Student;
import java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceExample {

    public static void main(String[] args) {

        /**
         * Function is a Functional Interface, introduced in java8, has an abstract method "apply", three default methods "andThen", "compose", and "identity"
         * This interface is same as a function, takes one input of type T, and returns output of type R
         * Return type of Function has to be pass as 2nd input while creating the object i.e Function<Integer,Double>, here the 2nd parameter which is double in this example Double will be the return type of this function
         * Implementing this interface will be same as creating method in java
         * Passing a functions as input is now possible with this interface
         * Here we will use Lambda Expression to implement this interface
         *
         */

        /**
         * Example 01
         * Have a look on a very simple example of Function
         */

        //Implementing Function Interface with 2 inputs, 1st will its argument type, 2nd will be it return type;
        //In this case "doubleAndStringFunction" going to accept a Double as input and returning a String
        Function<Double,String> doubleAndStringFunction = aDouble -> "This number is: " + aDouble;
        System.out.println(doubleAndStringFunction.apply(10.5));

        /**
         * Example 02
         *  In this example we are going to create a function which will return HashMap of Students having their Names and Activities
         *  Data will be used from StudentDatabase class under the Data package
         */

        //this "studentFunction" is going to accept List of student and return their Names and Activities
        Function<List<Student>, HashMap<String,List<String>>> studentFunction = students -> {
          HashMap<String, List<String>> gradesAndActivitesHashMap  =  new HashMap<>();
          students.forEach(student -> {
              gradesAndActivitesHashMap.put(student.getName(),student.getActivities());
          });
          return gradesAndActivitesHashMap;
        };

        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
