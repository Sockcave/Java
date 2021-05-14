import java.util.Scanner;

// You take a loan from a friend and need to calculate how much you will owe him after 3 months.
// You are going to pay him back 10% of the remaining loan amount each month.
// Create a program that takes the loan amount as input, ...
// ...calculates and outputs the remaining amount after 3 months.

public class LoanCalculator {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the loan amount.");
		int amount = scanner.nextInt();

        int remainder = amount;
        for(int i = 0; i < 3; i ++) {
            remainder = remainder - (remainder/10);
        }     
        System.out.println(remainder);   
	}
    
}
