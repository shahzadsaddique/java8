package java8.constructorreference;

import java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencExamples {

    /**
     * Constructor Reference is the term similar to Method Reference, Method References used for methods while Constructor References used for Constructors.
     * Using Method References we call methods of any class, Using Constructor Reference we can call constructors to create new objects
     * Syntax of Constructor Reference is : ClassName::new
     * If the Constructor of any class is non-argumental then Supplier interface will be use to create object,
     * If Constructor accepts one or two arguments Function interface will be used to initialize objects
     */

    public static void main(String[] args) {
        //this studentSupplier will return an empty object of Student class
        Supplier<Student> studentSupplier =  Student::new;
        Student student =  studentSupplier.get();

        //To call an argumental constructor we can use Function interface
        Function<Integer,Integer> integerFunction = Integer::new;
        //this integerFunction will return an object of Integer class, Initiated with our supplied value
        Integer num = integerFunction.apply(5);
        System.out.println("Num is: " + num);
    }
}
