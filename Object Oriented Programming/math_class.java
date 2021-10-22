public class math_class {

    // The Math class provided predefined methods for math ops.

    // Don't need to create a Math object to use the methods.

    public static void main(String[] args) {
         //Math.abs() returns the absolute value of its parameter.
        int a = Math.abs(10); // 10
        System.out.println(a); // 20

        int b = Math.abs(-20);
        System.out.println(b);

        /* Math.ceil() rounds a floating point value up to the nearest integer value. 
        The rounded value is returned as a double
        */
        double c = Math.ceil(7.342); // 8.0
        System.out.println(c);

        // Similarly, Math.floor() rounds a floating point value down to the nearest integer value.
        double d = Math.floor(7.342); // 7.0
        System.out.println(d);

        // Math.max() returns the largest of its parameters.
        int e = Math.max(10, 20); // 20
        System.out.println(e);

        // Math.min() returns the smallest parameter.
        int f = Math.min(10, 20); // 10
        System.out.println(f);

        /* Math.pow() takes two parameters and returns the first parameter 
        raised to the power of the second parameter.
        */
        double g = Math.pow(2, 3); // 8.0
        System.out.println(g);

    }
    
}
