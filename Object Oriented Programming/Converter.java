// Binary Converter Project

/* The binary numeric system uses only two digits: 0 and 1. Computers operate in binary, 
meaning they store data and perform calculations using only zeros and ones.
*/

/* Make a program to convert integer numbers to their binary representation.
Create a Converter class with a static toBinary() method, 
which returns the binary version of its argument.
The code in main takes a number as input and calls the corresponding static method. 
*/
import java.util.Scanner;

public class Converter {
    
    static String toBinary(int num) {
        String binary = "";
        while (num > 0) {
            binary = (num%2) + binary;
            num /= 2;
        }
        return binary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print(Converter.toBinary(x));
    }
}
