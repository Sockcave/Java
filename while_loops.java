// A while loop statement repeatedly executes a target statement as long as a given condition is true.

public class while_loops {

    public static void while1 (int x) {
        while (x > 0) {
            System.out.println(x);
            x --;
        }
    }

    public static void while2 (int x) {
        while (x < 10) {
            System.out.println("Java rocks!");
            x ++;
        }
    }

    public static void while3 (int x) {
        while (x < 10){
            System.out.println(x);
            x ++;
        }
        System.out.println("Loop ended.");
    }

    public static void while4 (int x, int y) {
        while (x < y) {
            System.out.println("Wassup.");
            x ++;
        }
    }
    public static void main(String[] args) {
        while_loops.while1(3);
        while_loops.while2(2);
        while_loops.while3(6);
        while_loops.while4(0, 5);
    }
}
