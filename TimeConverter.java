// Create a program that converts day to seconds.

import java.util.Scanner;

public class TimeConverter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the number of days.");
		int days = scanner.nextInt();

        int seconds = 24 * 60 *60 * days;

        System.out.println(seconds);
    }
}
