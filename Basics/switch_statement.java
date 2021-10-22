package Basics;
// A switch statement tests a variable for equality against a list of values.
// Each value is called a "case", and the variable being switched on is checked for each case.

/* 
//Syntax 

switch (expression) {
    case value1 :
      //Statements
      break; //optional
    case value2 :
      //Statements
      break; //optional
     //You can have any number of case statements.
     default : //Optional
        //Statements
 }
*/

// You can have any number of case statements within a switch.
// Each case is followed by the comparison value and a colon.
public class switch_statement {
    public static void example1 (int day) {
        switch(day) {
            case 1: 
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
        }
    }

    public static void example2 (int x) {
        switch(x) {
            case 10:
                System.out.println("A");
                break;
            case 20:
                System.out.println("B");
                break;
        }
    }

    // The default statement is an optional case you can include in a switch statement.
    // The default case can be used for performing a task when none of the cases are matched.
    public static void default1 (int day) {
        switch (day) {
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            // No break is needed in the default case, as it is always the last statement in the switch.
            default:
                System.out.println("Weekday");
        }
    }

    public static void default2 (int a, int b, int c) {
        switch (a) {
            case 40:
                System.out.println(b);
                break;
            default:
                System.out.println(c);
        }
    }

    // The switch expression allows multiple comma-separated values per case... 
    // ...and returns a value for the whole switch-case block.
    
    // public static void switch_exp1(int day) {
    //     String dayTime = switch(day) {
    //         case 1, 2, 3, 4, 5 -> "Working day";
    //         case 6, 7 -> "Weekend";
    //         default -> "Invalid day"; 

    // }

    public static void main(String[] args) {
        switch_statement.example1(3);
        switch_statement.example2(10);
        switch_statement.default1(3);
        switch_statement.default2(11, 12, 40);
    }
}
