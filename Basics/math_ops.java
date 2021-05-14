package Basics;
// Math operands include (+, -, *, /, %)

public class math_ops {

    // custom add method
    public static void add(int c, int d) {
        int result = c + d;
        System.out.println(result);
    }

    // custom multiplication method
    public static void multiply(int sum1, int sum2) {
        int sum3 = sum1 * sum2;
        System.out.println(sum3);
    }

    // custom division method
    public static void divide(int sum1, int sum2) {
        int sum3 = sum1 / sum2;
        System.out.println(sum3);
    }

    // dividing doubles or floats
    public static void divide_doubles(double sum1, double sum2) {
        double sum3 = sum1 / sum2;
        System.out.println(sum3);
    }

    // custom modulo method
    public static void modulo(int val1, int val2) {
        int val3 = val1 % val2;
        System.out.println(val3);
    }

    public static void main(String[] args) {
        int x = 6 * 3;
        System.out.println(x);

        int a = 2; int b = 4;
        int result = a + b;
        System.out.println(result);

        math_ops.add(9, 6);

        math_ops.multiply(1000*2, 1000*2*10);

        math_ops.divide(1000/5, (100/5)/2);

        math_ops.divide(15, 4);

        math_ops.divide_doubles(15.0, 4.0);

        math_ops.modulo(23, 6);
    }
    
}
