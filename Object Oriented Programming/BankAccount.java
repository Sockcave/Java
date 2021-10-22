// 4 core concepts in OOP: encapsulation, inheritance, polymorphism, and abstraction.

/* Encapsulation's main idea is to ensure impementation details are hidden from users.
Achieved by declaring the class variables as private and providing
public getter and setter methods to modify and view the variables' values.
*/

/* Data Hiding: Variables of one class are hidden from other classes. Accessible only through the methods
of the current class.
*/ 

public class BankAccount {
    // Implementation hides the balance variable, enabling access to it only through the deposit method
    private double balance = 0;

    public void deposit(double x) {
        if (x>0) {
            balance += x;
        }
    }

    /* Encapsualtion provides the following benefits.
    1) Control of the way data is accessed or modified
    2) More flexible and easily changed code
    3) Ability to change one part of the code without affecting other parts
    */

    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1);
        System.out.println(ba.balance);
    }
}
