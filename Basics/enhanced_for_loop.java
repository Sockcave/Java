// Enahanced For Loop (for each loop) is used to traverse elements in arrays.
// Advantages: eliminates possibility of bugs and makes the code more readable.
// You do not need to specify the loop bounds.


public class enhanced_for_loop {

    // So, on each iteration of the loop,...
    //... the variable t will be equal to the corresponding element in the array.
    public static void example1() {
        int[] primes = {2, 3, 5, 7};
        for (int t: primes) {
            System.out.println(t);
        }
    }


    public static void main(String[] args) {
        enhanced_for_loop.example1();
    }
    
}
