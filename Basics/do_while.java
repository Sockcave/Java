package Basics;
// A do...while loop is similar to a while loop... 
// ...except that a do...while loop is guaranteed to execute at least one time.

public class do_while {

    public static void example1() {
        int x = 1;
        do {
            System.out.println(x);
            x ++;
        } while (x < 5);
    }
    // Notice that the condition appears at the end of the loop...
    // ... so the statements in the loop execute once before it is tested.

    // Even with a false condition, the code will run once.
    public static void example2() {
        int x = 1;
        do {
            System.out.println(x);
            x ++;
        } while (x < 0);
    }
    public static void main(String[] args) {
        do_while.example1();
        do_while.example2();
    }
}
