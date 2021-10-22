/* Inheritance is the process that enables one class
 to acquire the properties (methods and variables) of another. 
 With inheritance, the information is placed in a more manageable, hierarchical order.
 */

/* The class inheriting the properties of another is the subclass (derived class, or child class); 
the class whose properties are inherited is the superclass (base class, or parent class).
*/

public class Animal_I {
    protected int legs;

    public void eat() {
        System.out.println("Animal eats");
    }
    
}
// To inherit from a class, use the extends keyword.
// This example shows how to have the class Dog to inherit from the class Animal.

// Dog = subclass
// Animal_I = superclass

/* When one class is inherited from another class,
 it inherits all of the superclass' non-private variables and methods.
 */
class Dog extends Animal_I {
    //  the Dog class inherits the legs variable from the Animal class.
// We can now declare a Dog object and call the eat method of its superclass:

    Dog() {
        legs = 4;
    }

    public static void main(String[] args) {
        // We can now declare a Dog object and call the eat method of its superclass:
        Dog d = new Dog();
        d.eat();
    }

    // Private methods are NOT inherited from the superclass.
}
