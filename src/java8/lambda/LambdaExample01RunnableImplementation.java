package java8.lambda;

public class LambdaExample01RunnableImplementation {

    public static void main(String[] args) {

        /**
         * Old java Runnable Implementation
         */

        /** Example 01
         *  Create a Runnable object and implement it's run() method
         */

        Runnable runnableRef =  new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable old approach");
            }
        };
        // Create a Thread Object with this Runnable object
        new Thread(runnableRef).start();


        /** Example 02
         * Lambda java8 Runnable Implementation
         * Create a Runnable object with Lambda
         */

        Runnable runnableLambdaRef =  () -> {
            System.out.println("Inside Runnable Lambda approach");
        };
        //Create a Thread with ths Lambda object
        new Thread(runnableLambdaRef).start();


        /** Example 03
         * If we have single statement inside lambda body we can write it without curly braces
         * as you can see below code
         * Create a Runnable object with Lambda
         */
        Runnable runnableLambdaRef1 =  () -> System.out.println("Inside Runnable Lambda single statement approach");
        //Create a Thread with ths Lambda object
        new Thread(runnableLambdaRef1).start();


        /** Example 04
         * May you noticed in above examples, that we are assigning Lambda to a reference variable, then passing it to thread class
         * we can also directly pass lambda to any method, see the example blow
         */
        new Thread(() -> System.out.println("Inside Runnable Lambda, Passing direct to Thread Class")).start();


    }
}
