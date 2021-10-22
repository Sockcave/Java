public class Counter {
    // Static Lesson
    /* When you declare a method or variable as STATIC, it belongs to the CLASS, rather than the 
    instance.
    Means that only ONE INSTANCE of a static member exists.
    */

    // Example
    public static int COUNT = 0;
    Counter() {
        COUNT++;
    }
    // The COUNT variable will be shared by ALL objects of THAT CLASS.
    // We can now create objects of our Counter class in main and access the static variable.

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.COUNT);

        System.out.println(c1.COUNT);
        System.out.println(c2.COUNT);

        /* Output is 2, because the COUNT variable is STATIC and gets incremented each time a
        NEW OBJECT of the Counter class is CREATED.
         You can access the static variable using any object of the class.
        */
    }
    

    // It’s a common practice to use upper case when naming a static variable, although not mandatorya
}
