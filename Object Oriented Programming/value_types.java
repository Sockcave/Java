public class value_types {
    
    // Value types are the basic types. Includes byte, short, int, long, float, double, char, boolean.

    /* These data types STORE the values ASSIGNED to them in CORRESPONDING MEMORY LOCATIONS.
    When you pass these values to a method, you operate on the variable's VALUE, rather
    the variable itself.
    */

    // Example
    public static void main(String[] args) {
        int x = 5;
        addOneTo(x);
        System.out.println(x);

        // Example 2
        int y = 4;
        square(y);
        System.out.println(y);
    }

    /* Method in this example takes the VALUE of its parameter, hence why the ORIGINAL variable x = 5
    is NOT affected.
    */
    static void addOneTo(int num) {
        num = num + 1;
    }

    static void square(int y) {
        y = y*y;
    }


}
