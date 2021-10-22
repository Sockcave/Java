public class constructors {
    // Constructors are special methods invoked when an object is created. Used to initialize objects.
    // Constructor MUST be the SAME NAME as its CLASS NAME
    // Constructor MUST have NO explicit return type.

    // Example, pretend the constructor and class name is 'Vehicle()'
    private String color;

    constructors() {
        this.setColor("Red");
    }
    // The Vehicle() method is the constructor of our class,...
    //... so whenever an object of that class is created, the color attribute will be set to "Red".

    constructors(String c) {
        this.setColor(c);
    }

    //Setter
    public void setColor(String c) {
        this.color = c;
    }

    public static void main(String[] args) {
        // Can use the two constructors to create class objects.

        //Color will be "Red"
        constructors v1 = new constructors();

        //Color will be "Green"
        constructors v2 = new constructors("Green");

        System.out.println(v1.color);
        System.out.println(v2.color);
    }
    
}
