public class final_keyword {
    // Final keyword is used to mark a variable as CONSTANT, so that it can only be assigned once.

    public static final double PI = 3.14;

    public static void main(String[] args) {
        System.out.println(PI);
        // PI is now a constant. Any attempt to assign it a value will cause an error.
    }
    
    /* Methods and classes can also be marked final. This serves to restrict methods so 
    that they can't be overridden and classes so that they can't be subclassed.
    */
}
