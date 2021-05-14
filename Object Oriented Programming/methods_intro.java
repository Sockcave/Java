// Methods define behavior. 
// A method is a collection of statements that are grouped together to perform an operation.
// For example: System.out.println() is a method.

class methods_intro {

    // Example of a method
    static void sayHello() {
        System.out.println("Hello World!");
    }

    // You can also create a method that takes some data, called parameters, ...
    //...along with it when you call it. Write parameters within the method's parentheses.
    // For example, we can modify our sayHello() method to take and output a String parameter.
    static void sayHello2(String name) {
        System.out.println("Hello " + name);
    }
    
    public static void main(String[] args) {
        sayHello();
        sayHello2("Andrew");
        sayHello2("Jovontay");
    }
}

// - code reuse: You can write a method once, and use it multiple times, ...
//...without having to rewrite the code each time.
// - parameters: Based on the parameters passed in, methods can perform various actions.
