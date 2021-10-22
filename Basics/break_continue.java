package Basics;
// Known as loop control statements (break) and (continue)

public class break_continue {

    // The break statement terminates the loop and transfers execution to the statement immediately...
    // ... following the loop.
    public static void break_exp() {
        int x = 1;

        while (x > 0) {
            System.out.println(x);
            if (x == 4) {
                break;
            }
            x ++;
        }
    }

    // The continue statement causes the loop to skip the remainder of its body and then immediately retest its condition prior to reiterating. 
    // In other words, it makes the loop SKIP to its NEXT iteration.
    public static void continue_exp() {
        for(int x = 10; x <= 40; x = x+10) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
    }

    // Using loop statements, print the values of the x variable 5 times.
    public static void five_times() {
        int x = 1;
        do {
            System.out.println(x);
            x ++;
        } while (x <= 5); // treat this line as the condition
    }
    public static void main(String[] args) {
        break_continue.break_exp();
        break_continue.continue_exp();
        
        break_continue.five_times();
    }
}
