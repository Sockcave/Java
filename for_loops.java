// A for loop allows you to efficiently write a loop that needs to execute a specific number of times.

public class for_loops {

    public static void forloop1() {
        // x is intialized to the value of 0 
        // Repeatedly prints the value of x until the condition x<=5 becomes false.
        for(int x = 0; x <= 5; x++) {
            System.out.println(x);
        }
    }

    // You can have any type of condition and any type of increment statements in the for loop.
    // The example below prints only the even values between 0 and 10.
    public static void even() {
        for(int x = 0; x <= 10; x = x+2) {
            System.out.println(x);
        }
    }

    public static void forloop2() {
        for(int i = 2; i < 10; i = i*i) {
            System.out.println(i);
        }
    }

    // A for loop is best when the starting and ending numbers are KNOWN.
    public static void main(String[] args) {
        for_loops.forloop1();
        for_loops.even();
        for_loops.forloop2();
        
    }
}
