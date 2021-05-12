import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
         // create an instance of the class by using the following syntax
        Scanner myVar = new Scanner(System.in);
        System.out.println("Please enter some text boi.");
        System.out.println(myVar.nextLine());

        Scanner myVar2 = new Scanner(System.in);
        System.out.println("Please enter some text again boi.");
        System.out.println("Ya" + myVar2.nextLine());
    }
}