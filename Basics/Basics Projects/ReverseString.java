// Reverse A String
// Write a program to take a string as input and output its reverse.
// The given code takes a string as input and converts it into a char array, ...
//...which contains letters of the string as its elements.

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a string to reverse.");
		String text = scanner.nextLine();
		char[] arr = text.toCharArray();
		
		//your code goes here
        String reverse = "";
        for(int i = arr.length-1; i >= 0; i--) {
            reverse += arr[i];
            }
        System.out.println(reverse);
    }
    
}


