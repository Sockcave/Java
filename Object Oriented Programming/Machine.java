/* Anonymous classes: way to extend existing classes right away.
*/

public class Machine {
    public void start() {
        System.out.println("Starting...");
    }

    // When creating the Machine object, we can change the start method on the fly.

    /* After the constructor call, we have opened the curly braces 
    and have overridden the start method's implementation.
    */

    // The @Override annotation is used to make your code easier to understand, 
    // because it makes it more obvious when methods are overridden.
    public static void main(String[] args) {
        Machine m = new Machine() {
        @Override public void start() {
            System.out.println("Wooooo");
        }
    };
    m.start();
    }
}