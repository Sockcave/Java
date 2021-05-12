// Incrementing and Decrementing
// More convenient ways to increase or decrease the value of a variable by one

public class increment_ops {

    // custom increment method
    public static void increment(int x) {
        ++ x;
        System.out.println(x);
    }

    // custom decrement method
    public static void decrement(int x) {
        -- x;
        System.out.println(x);
    }

    // 2 forms: prefix and postfix, may be used with both the increment and decrement operators
    // With prefix form, the operator appears before the operand...
    // ...while in postfix form, the operator appears after the operand.

    // custom prefix method
    public static void prefix(int x) {
        int y = ++x;
        // prefix increments the variable's value and uses the new value in the expression.
        /*
        int x = 34;
        int y = ++ x; // the value of x is frst incremented to 35, and is then assigned to y
        // so both valiues of x and y are now 35.
        */
        System.out.println(y);
    }

    public static void postfix(int x) {
        int y = x++;
        // x is first assigned to y. Therefore y becomes x while x becomes x+1
        System.out.println(y);

    }

    public static void assign(int num1, int num2) {
        System.out.println(num2 += num1); // num2 = num2 + num1
        System.out.println(num2 -= num1); // num2 = num2 - num1

    }
    public static void main(String[] args) {
        increment_ops.increment(5);
        increment_ops.decrement(5);

        increment_ops.prefix(34);
        increment_ops.postfix(34);

        increment_ops.assign(4, 8);
        
    }
}
