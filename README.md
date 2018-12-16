# New in Java8
Java8 released with many new exciting features, some of those are:
- Lambda expressions
- Functional interfaces
- Streams API
- Optional 
- New Date/Time API
- Declarative programming with Lambdas and Functional interfaces

## Code Examples

- ### [Declarative Vs Imperative Programming](https://github.com/shahzadsaddique/java8/tree/master/src/java8/declarativeprogramming)<br/>
    In declarative approach we focus on what to get, OR simply our concerns is Results not logic, we don't look what's happening behind the walls. In declarative style we just have to find and call pre-define/built-in functions. Declarative style is just like SQL. <br/>For more details about this have a look on **[Example 01](https://github.com/shahzadsaddique/java8/blob/master/src/java8/declarativeprogramming/DeclarativeProgrammingExample01.java)** and **[Example 02](https://github.com/shahzadsaddique/java8/blob/master/src/java8/declarativeprogramming/DeclarativeProgrammingExample02.java)** 
  
- ###  [Lambda Expressions](https://github.com/shahzadsaddique/java8/tree/master/src/java8/lambda)<br/>
    Lambdas are functions without names, also known as Anonymous functions, they can have Method Parameters, Method Body, and Return types. Lambdas are independent functions, they are not related to any class. Lambdas can be assigned & passed out to other functions.<br/> A lambda consist of three parts: **() -> {}**  <br/> 1. **()** Lambda Parameters<br/>2. **->** Lambda Arrow Separator <br/> 3. **{}** Lambda Body<br/> Lambdas are mainly used for implementations of functional interfaces. <br/> For code examples please have a look on **[Example 01](https://github.com/shahzadsaddique/java8/blob/master/src/java8/lambda/LambdaRunnableImplementation.java)** and  **[Example 02](https://github.com/shahzadsaddique/java8/blob/master/src/java8/lambda/LambdaComparatorImplementation.java)**    

- ###  [Functional Interfaces](https://github.com/shahzadsaddique/java8/tree/master/src/java8/functionalinterfaces)<br/>
    Interfaces that have only one abstract method, but they can have multiple default methods. Functional Interfaces introduced in Java8. <br/> **@FunctionalInterface** is an optional annotation can be used with functional interfaces to make sure that an interface is not breaking the rule i.e Only a single abstract method. <br/> Four types of new functional interfaces were introduced in java8 which are:
     - #### Consumer 
       A Functional Interface with one abstract method named "accept" and one default method named "andThen". The "accept" method takes one argument, performs action on it, and returns nothing. Usually Consumer Interface used where return value is not needed.<br/> For more details about Consumer Interface please have a look on this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/ConsumerFunctionalInterfaceExample.java)<br/>
       Consumer has an extension which is called **BiConsumer**. BiConsumer is similar to the Consumer Interface the only difference is BiConsumer accepts two arguments, while Consumer has one argument. Please have a look on this [**BiConsumer Interface Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiConsumerFunctionalInterfaceExample.java)
     - #### Predicate
       A Functional Interface accepts one argument and returns a boolean, also has 3 default methods based on "and", "or" and "negate" switches. See the  **[Code Example](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/PredicateFunctionalInterfaceExample.java)** for more details.<br/>
        Like Consumer, Predicate also has an extension called **BiPredicate**. BiPredicate is same as predicate except it has two inputs while Predicate has only one. Please check this [**BiPredicate Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiPredicateFunctionalInterfaceExample.java) for more details.  
     - #### Function 
        Function is a Functional Interface, introduced in java8, has an abstract method 'apply', three default methods 'andThen', 'compose' and 'identity'. This interface is same as a function, takes one input of type T, and returns output of type R. <br/>Implementing this interface will be same as creating method in java. Return type of Function has to be pass as 2nd input while creating the object i.e Function<Integer,Double>, here the 2nd parameter which is double in this example Double will be the return type of this function. Check this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/FunctionFunctionalInterfaceExample.java) to see the implementation of this interface.<br/>
        Function interface also has an extension called **BiFunction**. BiFunction accepts two inputs and returns a value of required type. Check [**BiFunction Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiFunctionFunctionalInterfaceExample.java) for more details.      
     - #### Supplier
        