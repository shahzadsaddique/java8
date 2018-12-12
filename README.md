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
     - **Consumer** <br/> A Functional Interface wih one abstract method named "accept" and one default method named "andThen". The "accept" method takes one argument, performs action on it, and returns nothing. Usually Consumer Interface used where return value is not needed. For more details about Consumer Interface please have a look on this [Code Example](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/ConsumerFunctionalInterfaceExample.java)
     - **Predicate**
     - **Function**
     - **Supplier**
        