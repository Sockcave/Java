// Conditional Statements
// Used to perform different actions based on different conditions.

/*
Any of the following comparison operators may be used to form the condition:
< less than
> greater than
!= not equal to
== equal to
<= less than or equal to
>= greater than or equal to
*/

public class conditions {

    public static void example1() {
        int x = 7;
        if(x < 42) {
            System.out.println("Hi");
        }
    }

    public static void example2() {
        int x = 5;
        if (x == 5) {
            System.out.println("Yeah");
        }
    }

    public static void example3() {
        int age = 30;

        if (age < 16) {
            System.out.println("Too young.");
        } else {
            System.out.println("Welcome!");
        }
    }

    public static void printGreatestNumber(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // You can nest as many if-else statements as you want.
    public static void nested() {
        int age = 25;
        if (age > 0) {
            if (age > 16) {
                System.out.println("Welcome!");
            } else {
                System.out.println("Too young!");
            }
        } else {
            System.out.println("Error.");
        }
    }

    public static void nested2() {
        int x = 37;
        if (x > 22) {
            if (x > 31) {
                System.out.println("It works!");
            }
        }
    }

    public static void else_if() {
        int age = 25;

        if (age <= 0) {
            System.out.println("Error.");
        } else if (age <= 16) {
            System.out.println("Too young.");
        } else if (age < 100) {
            System.out.println("Welcome!");
        } else {
            System.out.println("Really?");
        }
    }
    public static void main(String[] args) {
        conditions.example1();
        conditions.example2();
        conditions.example3();

        conditions.printGreatestNumber(10, 5);
        conditions.nested();
        conditions.nested2();
        conditions.else_if();
    }
        
}
