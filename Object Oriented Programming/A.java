// Create an object of the A class in the B method and call its test method.

public class A {
    public void test() {
        System.out.println("Hi.");
    }
}

class B {
    public static void main(String[] args) {
        A obj = new A();
        obj.test();
    }
}