// The return keyword can be used in methods to return a value.
// For example, we could define a method named sum that returns the sum of its two parameters.

public class return_intro {

    // When you do not need to return any value from your method, use the keyword VOID.
    // Notice the void keyword in the definition of the main method...
    // ...- this means that main does not return anything.
    static int sum (int val1, int val2) {
        return val1 + val2;
    }

    public static void main(String[] args) {
        int x = sum(2, 5);
        System.out.println(x);
    }
}
