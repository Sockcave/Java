package Basics;
/** This is a documentation comment */
class methods {
    public String name = "Andrew";

    public void jarvis(String name) {
        System.out.println("Greetings Master " + name);
    }

    public static void friday(String dork) {
        System.out.println("Go to hell " + dork);
    }

    public static void main(String[] args) {
        methods m = new methods();
        m.jarvis("Sven");

        m.jarvis("Mom");

        methods.friday("Andrew");
    }

}


