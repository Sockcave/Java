// Logical operators are used to combine multiple conditions.

public class logical_statements {

    public static void version1(int age, int money) {
        if (age > 18) {
            if (money > 500) {
                System.out.println("Welcome!");
            }
        }
    }

    // AND logical operator (&&)
    public static void version2(int age, int money) {
        if (age > 18 && money > 500) {
            System.out.println("Welcome!");
        }
    }

    // OR operator (||) checks if any one of the conditions is true.
    public static void or_example(int age, int money) {
        if (age > 18 || money > 500) {
            System.out.println("Welcome!");
        }
    }

    // NOT (!) logical operator is used to reverse the logical state of its operand.
    public static void not_example(int age, int money) {
        if (!(age > 18)) {
            System.out.println("Too young.");
        } else {
            System.out.println("Welcome.");
        }
    }

    public static void example1(int a, int b, int c) {
        if (a > 100 || b > 3) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
    public static void main(String[] args) {
        logical_statements.version1(21, 1000);
        logical_statements.version2(21, 1000);
        logical_statements.or_example(25, 100);
        logical_statements.not_example(25, 100);
        logical_statements.example1(11, 12, 40);
    }
}
