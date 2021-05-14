// More on the return keyword.
// Return keyword does not seem to output anything in the terminal unless I PRINT it.

public class return_more {

    // Return the max value
    static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Example 
    public static int myFunc(int x) {
        return x*3;
    }
    public static void main(String[] args) {
        max(9, 6);
        System.out.println(max(9, 6));
        myFunc(5);
        System.out.println(myFunc(5));
    }
    
}
