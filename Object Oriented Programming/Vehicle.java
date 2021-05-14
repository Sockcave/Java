// A class has attributes and methods. 
// Attributes are basically the variables in a class.

// Access Modifiers:
// Access modifiers are used to set the level of access.
// For exmaple: public is an access modifier
// public: class is accessible by any other class.
// default: class is accessible only by classes in the same package.
// private: Accessible only within the declared class itself.
// protected: Provides the same access as the default access modifier, ...
// ...with the addition that subclasses can access protected methods and variables of the superclass 

// Getters and Setters:
// Getters and Setters are used to effectively protect your data, particularly when creating classes. 
// For each variable, the get method returns its value, while the set method sets the value.

// Getters start with get, followed by the variable name, ...
//...with the first letter of the variable name capitalized.
// Setters start with set, followed by the variable name, ...
//...with the first letter of the variable name capitalized.

// Creating a class called "Vehicle".
public class Vehicle {
    // The attributes of our Vehicle class and some examples of private attributes.
    private int maxSpeed;
    private int wheels;
    private String color;
    private double fuelCapacity;
    // It's good practice to keep the variables within a class private. 
    // The variables are accessible and modified using Getters and Setters.

    // The method of our Vehicle class.
    public void horn() {
        System.out.println("Beep!");
    }

    // Getter
    public String getColor() {
        return color;
    }

    // Setter
    public void setColor(String c) {
        // this keyword is used to refer to the current object. 
        // Basically, this.color is the color attribute of the current object.
        this.color = c;
    }
    public static void main(String[] args) {
        // Creating multiple objects of our Vehicle class.
        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        v1.color = "red";
        v2.horn();

        // Once our getter and setter have been defined, we can use it in our main
        v1.setColor("red");
        System.out.println(v1.getColor());
    }
}
