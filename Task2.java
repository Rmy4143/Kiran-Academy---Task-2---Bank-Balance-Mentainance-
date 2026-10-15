
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 5000;

        System.out.print("Enter payment amount: ");
        int amount = sc.nextInt();

        if (amount < 0) {
            System.out.println("Amount negative");
        }
        else if (amount > balance) {
            System.out.println("Payment failed");
        }
        else {
            System.out.println("Payment success");
            balance = balance - amount;

            if (balance == 0) {
                System.out.println("Account khali ho gaya");
            }
            else {
                System.out.println("Remaining balance: " + balance);
            }
        }

        sc.close();
    }
}
