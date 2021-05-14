// To create custom objects, you have to first create corresponding classes.
// Our first class will be called "Animals"

public class Animal {
    // We delcared a bark method in our "Animals" class.
    void bark() {
        System.out.println("Woof-Woof");
    }
    // Now, in order to use the class and it's methods, we need to declare an object of that class.

    // Go to main and create a new object of our class.
    public static void main(String[] args) {
        // Now, dog is an object of type Animal. 
        Animal dog = new Animal();
        // Thus we can call its bark() method, using the name of the object and a dot.
        dog.bark();
        // The dot notation is used to access the object's attributes and methods.
    }
}
