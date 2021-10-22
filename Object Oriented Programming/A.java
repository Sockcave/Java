// Create an object of the A class in the B method and call its test method.


/* Constructors are not member methods, and so are not inherited by subclasses.
However, the CONSTRUCTOR of the superclass is CALLED when the subclass is instantiated.
*/

public class A {
    public void test() {
        System.out.println("Hi.");
    }

    // Constructor
    public A() {
        System.out.println("New A");
    }

}

class B extends A{

    // Constructor
    public B() {
        System.out.println("New B");
    }


    public static void main(String[] args) {
        // A obj = new A();
        // obj.test();

        B obj = new B();
        obj.test();
    }
}