public class Vehicle2 {
    private int maxSpeed2;
    private int wheels2;
    private String color2;
    private double fuelCapacity2;

    public void horn2() {
        System.out.println("Beep!");
    }

    //Getter
    public String getColor2() {
        return color2;
    }

    //Setter
    public void setColor2(String c2) {
        this.color2 = c2;
    }

    public static void main(String[] args) {
        Vehicle2 v1 = new Vehicle2();
        Vehicle2 v2 = new Vehicle2();
        v1.color2 = "yellow";
        v2.horn2();

        // Once our getter and setter have been defined, we can use it in our main
        v1.setColor2("green");
        String x = v1.getColor2();
        System.out.println(x);
    }
}
