// The return keyword can be used in methods to return a value.
// For example, we could define a method named sum that returns the sum of its two parameters.

public class return_intro {

    // When you do not need to return any value from your method, use the keyword VOID.
    // Notice the void keyword in the definition of the main method...
    // ...- this means that main does not return anything.
    static int sum (int val1, int val2) {
        return val1 + val2;
    }

    //returns an int value of 5
    static int returnFive() {
        return 5;
    }

    // has a parameter
    static void sayHelloTo(String name) {
        System.out.println("Hello " + name);
    }

    // simply prints "Hello World."
    static void sayHello() {
        System.out.println("Hello World.");
    }

    // Return the max value
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Example 
    public static int myFunc(int x) {
        return x*3;
    }

    // This definition indicates that the main method takes an array of Strings as its parameters, ...
    //..and does not return a value.
    public static void main(String[] args) {
        int x = sum(2, 5);
        System.out.println(x);

        returnFive();
        sayHelloTo("Zuko");
        sayHello();

        max(9, 6);
    }
}
