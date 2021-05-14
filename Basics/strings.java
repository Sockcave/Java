// A String is an object that represents a sequence of characters.
// "Hello" for example is a string of 5 characters.

// String Concatenation is done with the (+) sign
// 

public class strings {

    public static void concat(String firstName, String lastName) {
        System.out.println("My name is " + firstName + " " + lastName);
    }
    public static void main(String[] args) {
        String s = "SoloLearn";
        String empty = "";
        System.out.println(s);
        System.out.println(empty);

        strings.concat("Sven", "Wu");
    }
}
