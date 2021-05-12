// Scanner object lets us get user input. 

/*
Here are some methods that are available through the Scanner class:
Read a byte - nextByte()
Read a short - nextShort()
Read an int - nextInt()
Read a long - nextLong()
Read a float - nextFloat()
Read a double - nextDouble()
Read a boolean - nextBoolean()
Read a complete line - nextLine()
Read a word - next()
*/

// Import the scanner class to use.
import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
         // create an instance of the class by using the following syntax to use it.
        Scanner myVar = new Scanner(System.in);
        System.out.println("Please enter some text boi.");
        System.out.println(myVar.nextLine());

        Scanner myVar2 = new Scanner(System.in);
        System.out.println("Please enter some text again boi.");
        System.out.println("Ya" + myVar2.nextLine());
    }
}