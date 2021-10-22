interface Animal_In {
    /* Interface: completely abstract class with only abstract methods.
    1) Defined with the interface keyword
    2) may contain only static final variables
    3) CANNOT contain constructors becuz interfaces cannot be instantiated
    4) Interfaces can EXTEND other interfaces.
    5) A class can implement any number of interfaces.
    */

    public void eat();
    public void makeSound();

    /* Interface Properties
    1) An interface is implicitly abstract. Don't need the abstract keyword while declaring an interface.
    2) Each method in an interface is also implicitly abstract, so the abstract keyword is not needed.
    3) Methods in an interface are implicitly public.
    */

    // A class can inherit from just one superclass, but can implement multiple interfaces!
    
}

// Use the implements keyword to use an interface with your class.

class Cat implements Animal_In {

    // When you implement an interface, you need to override all of its methods.
    public void makeSound() {
        System.out.println("Meow");
    }
    
    public void eat() {
        System.out.println("omnomnom");
    }

}