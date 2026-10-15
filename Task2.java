public class Task3 {
    public static void main(String[] args) {
        int amount = 5000;
        int balance = 5000;

        if (amount < 0) {
            System.out.println("Amount negative");
        }
        else if (amount > balance) {
            System.out.println("Payment failed");
        }
        else {
            System.out.println("Payment success");

            if (amount == balance) {
                System.out.println("Account khali ho gaya");
            }
        }
    }
}