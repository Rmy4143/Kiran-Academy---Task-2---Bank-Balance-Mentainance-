💳 Task 2: Java Payment Validation System

📌 Overview

This project is a simple Java program that simulates a payment validation system. It accepts a payment amount from the user and checks whether the payment is valid based on the available account balance.

🚀 Features

- Accepts payment amount through user input.
- Validates negative payment amounts.
- Checks whether sufficient balance is available.
- Displays payment success or failure messages.
- Calculates the remaining balance.
- Notifies the user when the account balance becomes zero.

🛠️ Technologies Used

- Language: Java
- Concepts: Scanner, variables, conditional statements, nested if-else, and arithmetic operators.

💻 Source Code

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

📤 Sample Output

Example 1: Successful Payment

Enter payment amount: 2000
Payment success
Remaining balance: 3000

Example 2: Full Balance Used

Enter payment amount: 5000
Payment success
Account khali ho gaya

Example 3: Insufficient Balance

Enter payment amount: 6000
Payment failed

▶️ How to Run

1. Install the Java Development Kit (JDK).

2. Save the code as "Task2.java".

3. Open a terminal in the project directory.

4. Compile the program:
   
   javac Task2.java

5. Execute the program:
   
   java Task2

🎯 Learning Objectives

- Understand user input using the "Scanner" class.
- Implement "if", "else if", and "else" statements.
- Perform arithmetic operations in Java.
- Apply basic payment validation logic.

👨‍💻 Author

Bhagyesh Patil

---

⭐ This project is created for practicing Java fundamentals and conditional logic.

Note: This is an educational program. The balance resets to ₹5,000 each time the program runs, and it does not process real payments.