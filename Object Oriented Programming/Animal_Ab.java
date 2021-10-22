abstract class Animal_Ab {
    /* Data Abstraction provides the outside world with only essential information.
    Represents essential features without including implementation details.
    */

    /*
    Abstraction: Focus on essential qualities, rather than the specific characteristics of one example.
    Achieved with abstract classes and interfaces.
    Defined with the "abstract" keyword

    1) If a class is declared abstract it cannot be instantiated (cannot create objects of that type).
    2) To use an abstract class, you have to inherit it from ANOTHER class.
    3) Any class that contains an abstract method should be defined as abstract.
    */

    /* An abstract method is a method that is declared without an implementation 
    (WITHOUT  braces, and followed by a semicolon)
    Ex: abstract void walk();
    */

    // A class containing an abstract method is an abstract class.

    int legs = 0;
    abstract void makeSound();

}

class Cat extends Animal_Ab {
    public void makeSound() {
        System.out.println("Meow");
    }

    /* Every Animal makes a sound, but each has a different way to do it. 
    That's why we define an abstract class Animal, 
    and leave the implementation of how they make sounds to the subclasses.
    This is used when there is no meaningful definition for the method in the superclass.
    */
}
