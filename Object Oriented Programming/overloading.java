/* Overloading: when methods have the SAME NAME, but DIFFERENT parameters.
Useful for when you need the SAME method functionality for DIFFERENT types of parameters.
*/
public class overloading {

    /* method shown below will only work for parameters of type integer.
However, we might want to use it for doubles, as well. For that, you need to overload the max method:
    */
    static int max(int a, int b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
    // Overloading the max method for doubles.
    static double max(double a, double b) {
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }

    /* , our max method will also work with doubles.
    An overloaded method must have a different argument list; 
    the parameters should differ in their type, number, or both.
    */

    // Another name for method overloading is compile-time polymorphism.
    public static void main(String[] args) {
        System.out.println(max(3, 5));
        System.out.println(max(3.0, 5.0));
    }
}
