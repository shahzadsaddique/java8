# New in Java8
Java8 released with many new exciting features, some of these are:
- [Lambda expressions](https://github.com/shahzadsaddique/java8#lambda-expressions)
- [Functional interfaces](https://github.com/shahzadsaddique/java8#functional-interfaces)
- [Method and Constructor References](https://github.com/shahzadsaddique/java8#method-reference)
- [Streams API](https://github.com/shahzadsaddique/java8#streams-api)
- Optional 
- New Date/Time API
- [Declarative programming with Lambda](https://github.com/shahzadsaddique/java8#declarative-vs-imperative-programming)

## Code Examples

- ### [Declarative Vs Imperative Programming](https://github.com/shahzadsaddique/java8/tree/master/src/java8/declarativeprogramming)<br/>
    In declarative approach we focus on what to get, OR simply our concern is Result not logic, we don't look what's happening behind the walls. In declarative style we just have to find and call pre-define/built-in functions. Declarative style is just like SQL. <br/>For more details about this have a look on **[Example 01](https://github.com/shahzadsaddique/java8/blob/master/src/java8/declarativeprogramming/DeclarativeProgrammingExample01.java)** and **[Example 02](https://github.com/shahzadsaddique/java8/blob/master/src/java8/declarativeprogramming/DeclarativeProgrammingExample02.java)** 
  
- ###  [Lambda Expressions](https://github.com/shahzadsaddique/java8/tree/master/src/java8/lambda)<br/>
    Lambdas are functions without names, also known as Anonymous functions, they can have Method Parameters, Method Body, and Return types. Lambdas are independent functions, they are not related to any class. Lambdas can be assigned & passed out to other functions.<br/> A lambda consist of three parts: **() -> {}**  <br/> 1. **()** Lambda Parameters<br/>2. **->** Lambda Arrow Separator <br/> 3. **{}** Lambda Body<br/> Lambdas are mainly used for implementations of functional interfaces. <br/> For code examples please have a look on **[Example 01](https://github.com/shahzadsaddique/java8/blob/master/src/java8/lambda/LambdaRunnableImplementation.java)** and  **[Example 02](https://github.com/shahzadsaddique/java8/blob/master/src/java8/lambda/LambdaComparatorImplementation.java)**    

- ###  [Functional Interfaces](https://github.com/shahzadsaddique/java8/tree/master/src/java8/functionalinterfaces)<br/>
    Interfaces that have only one abstract method, but they can have multiple default methods. Functional Interfaces introduced in Java8. <br/> **@FunctionalInterface** is an optional annotation can be used with functional interfaces to make sure that an interface is not breaking the rule i.e Only a single abstract method. <br/> Four types of new functional interfaces were introduced in java8 which are:
     - #### Consumer 
       A Functional Interface with one abstract method named "accept" and one default method named "andThen". The "accept" method takes one argument, performs action on it, and returns nothing. Usually Consumer Interface used where return value is not needed.<br/> For more details about Consumer Interface please have a look on this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/ConsumerFunctionalInterfaceExample.java)<br/>
       **BiConsumer** is extension of Consumer, BiConsumer is similar to the Consumer Interface the only difference is BiConsumer accepts two arguments, while Consumer has one argument. Please have a look on this [**BiConsumer Interface Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiConsumerFunctionalInterfaceExample.java)
     - #### Predicate
       A Functional Interface accepts one argument and returns a boolean, also has 3 default methods based on "and", "or" and "negate" switches. See the  **[Code Example](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/PredicateFunctionalInterfaceExample.java)** for more details.<br/>
       **BiPredicate** is extension of Predicate, BiPredicate is same as predicate except it has two inputs while Predicate has only one. Please check this [**BiPredicate Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiPredicateFunctionalInterfaceExample.java) for more details.  
     - #### Function 
        Function is a Functional Interface, introduced in java8, has an abstract method 'apply', three default methods 'andThen', 'compose' and 'identity'. This interface is same as a function, takes one input of type T, and returns output of type R. <br/>Implementing this interface will be same as creating method in java. Return type of Function has to be passed as 2nd input while creating the object i.e Function<Integer,Double>, here the 2nd parameter which is double in this example Double will be the return type of this function. Check this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/FunctionFunctionalInterfaceExample.java) to see the implementation of this interface.<br/>
        **BiFunction** is extension of Function interface, BiFunction accepts two inputs and returns a value of required type. Check [**BiFunction Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BiFunctionFunctionalInterfaceExample.java) for more details. <br/>
        **UnaryOperator** is a type of Function interface, UnaryOperator is a functional interface which extends Function interface. We can use this interface instead of Function, where we know that input and output are going to be of same type. See this [**UnaryOperator Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/UnaryOperatorFunctionalInterfaceExample.java) for more details. <br/>
        **BinaryOperator** is a type of Function interface, BinaryOperator is a functional interface which extends BiFunction interface. We can use this interface instead of BiFunction, where we know that both inputs and output are going to be of same type. Check this [**BinaryOperator Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/BinaryOperatorFunctionalInterfaceExample.java) for more details.
     - #### Supplier
        Supplier is a Functional Interface, introduced in java8.  It takes no input and returns a value of type T, has only one abstract method 'get()'. This interface is inverted version of Consumer interface which takes one argument and returns nothing, while it takes nothings and return a value. See this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/functionalinterfaces/SupplierFunctionalInterfaceExample.java) for more details.  
        
- ###  [Method Reference](https://github.com/shahzadsaddique/java8/tree/master/src/java8/methodreferences)<br/>
    We can simplify the implementation of Functional Interface using Method references
    , Introduced in java8. They are shorthand syntax of Lambda expressions. We can use them to replace Lambda expressions, and here we don't need to pass the arguments manually, If the method accepts arguments they passed automatically behind the scenes. <br/> Syntax of Method references is **ClassName::methodName**. For code examples and other implementation details check this [**Examples File**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/methodreferences/MethodReferencesExamples.java)
    
- ###  [Constructor Reference](https://github.com/shahzadsaddique/java8/tree/master/src/java8/constructorreference)<br/>
    Constructor Reference is the term similar to Method Reference, Method References used for methods while Constructor References used for Constructors. Using Method References we call methods of any class, Using Constructor Reference we can call constructors to create new objects. <br/> Syntax of Constructor Reference is : **ClassName::new** <br/>
    If the Constructor of any class is non-argumental then Supplier interface will be use to create object, and if Constructor accepts one or two arguments Function interface will be used to initialize objects. Have a look on this [**Implementation Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/constructorreference/ConstructorReferencExamples.java) for more details.
    
- ###  [Streams API](https://github.com/shahzadsaddique/java8/tree/master/src/java8/streams)<br/>
    Stream API introduced in java8, It performs operations on collection of objects. Stream API can be used with Java Collections, Arrays, and IO channels. Operations can be parallel and sequential, parallel operations are much easier with stream api. <br/> Stream can have multiple intermediate operations, each intermediate operation returns a stream. There must be a terminal operation at the end of stream. In stream intermediate operations are lazy, this means if there is no terminal operation in the steam, intermediate operations will not be executed. For implementation details check this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/StreamAPIExamples.java).<br/>Some commonly used operations of Stream API 
    - #### map and flatMap
         map(): map function takes a function as input and apply it on the given object and transfer it into other object, and returns the stream consist of results. <br/> flatMap(): flatMap work on Collections of Collections i.e List of list, accepts a function as input apply it on given data, and returns one or more values. See these [**Code Examples**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/MapFlatMapStreamOperationExamples.java) for more details.
    - #### distinct and count
        distinct(): this is an intermediate stream operation, return stream of distinct elements. <br/>count(): intermediate stream operation, returns a Long value by counting the elements of stream. For implementation details check this [**Examples File**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/DistinctCountStreamOperationExamples.java)
    - #### sorted
        sorted() is an intermediate stream operations, used to sort elements in the stream. Elements can be sorted either natural order or using Comparator. We can also reverse the sorted elements to sort them ASC and DSC orders. Have a look on this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/SortedStreamOperationExamples.java) for more details.
    - #### filter and reduce
        filter() and reduce() both are Stream operations.<br/> filter(): is an intermediate operation, accepts a Predicate as input to filter the Stream elements and returns a stream of filtered elements. <br/> reduce(): is a terminal operation, perform reduction on stream elements to produce a single resultant, accepts Binary operator as accumulator, combine or operate the stream in such a way that it returns only a single value usually an Optional of type T. <br/> See these [**Code Examples**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/FilterReduceStreamOperationExamples.java) for more details.
    - #### limit and skip
         limit() and skip() both are intermediate Stream operations. <br/> limit(): accepts a long:n as input and returns a Stream of first n elements. <br/> skip(): accepts a long:n as input skips the first n elements and returns a Steam if remaining elements. <br/> For more details about limit() and skip() check this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/LimitSkipStreamOperationExamples.java)
    - #### anyMatch, allMatch, noneMatch
        anyMatch(), allMatch() and noneMatch() all of these are short-circuiting terminal operations, they ll return false if Stream is empty. <br/> anyMatch(): accepts a Predicate as input and returns true or false i.e either the element match with any of stream elements or not.<br/> allMatch(): accepts a Predicate as input, returns true if all elements in the Stream are same as test Predicate. <br/> noneMatch(): accepts a Predicate and returns true if none of the elements in the Stream match with tested element. <br/> Have a look on this [**Code Example**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/AnyMatchAllMatchOperationExamples.java) for more details.
    - #### findAny and findFirst
        findAny() and findFirst() both are short-circuiting terminal operations, returns an Optional if element found or Empty Optional if Stream is empty.<br/>findFirst() returns first element matched from the Stream's element.<br/>findAny() returns the any matched element from the Stream<br/> Both works same in Sequential processing i.e returns the first matched element, But in parallel operations findAny() works better in performance. <br/> See these [**Code Examples**](https://github.com/shahzadsaddique/java8/blob/master/src/java8/streams/FindFirstFindAnyStreamsOperationExample.java) for more details.
    - #### Stream API Factory Methods
        There are three factory methods on Stream API.<br/> **Of()** : this is a static method, used to create a stream of values passed to this method.<br/> iterate() & generate() : both are static and infinite methods. <br/> **iterate()** : is used to iterate over any expression for infinite time to create infinite, initial value is supplied and limit() is also required to stop it iteration. <br/> **generate()** : takes an object supplier and used to create infinite stream of objects. Check these [**Code Examples**]() for more details.

