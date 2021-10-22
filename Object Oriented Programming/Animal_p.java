/* Polymorphism: refers to the idea of "having many forms".
A hierarchy of classes related to each other through inheritance.
A call to a member method will cause a DIFFERENT implementation to be executed, 
depending on the type of the object invoking the method.
*/

// Polymorphism is one method with different implementations.

// Example Dog and Cat are classes that inherit from the Animal_P class.
// They each have their own implmentation of the makeSound() method.
public class Animal_p {
    public void makeSound() {
        System.out.println("Grr...");
    }  

    public static void main(String[] args) {
    // We've created 2 reference variables of type Animal, and pointed them to the Cat and Dog objects.
        Animal_p a = new Dog_p();
        Animal_p b = new Cat_p();

    // Now, we can call the makeSound() methods
        a.makeSound();
        b.makeSound();
    }
}
/* Overriding: a subclass can define a behavior that's specific to the subclass type, meaning that a 
subclass can implement a parent class method based on its requirement.
*/

//  the Cat class overrides the makeSound() method of its superclass Animal.
class Cat_p extends Animal_p {
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog_p extends Animal_p {
    public void makeSound() {
        System.out.println("Woof");
    }
}
/* This demonstrates that you can use the Animal variable without actually knowing 
that it contains an object of the subclass.
This is very useful when you have multiple subclasses of the superclass.
*/

/* Rules for overriding
1) Should have the same return type and arguments
2)  access level cannot be more restrictive than the overridden method's access level 
(Example: If the superclass method is declared public, 
the overriding method in the sub class can be neither private nor protected)
3) A method declared final or static cannot be overridden
4)  If a method cannot be inherited, it cannot be overridden
5) Constructors cannot be overridden
*/