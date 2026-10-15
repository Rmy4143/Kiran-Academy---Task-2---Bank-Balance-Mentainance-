# 💳 Java Payment Validation System

## 📌 Overview
This project is a simple Java program that simulates a basic payment validation system. It checks whether a payment amount is valid, whether the account has sufficient balance, and whether the payment leaves the account balance empty.

## 🚀 Features
- **Amount Validation:** Checks whether the payment amount is negative.
- **Balance Verification:** Prevents payments that exceed the available balance.
- **Payment Success:** Displays a success message when the payment is valid.
- **Balance Check:** Notifies the user when the payment uses the entire balance.

## 🛠️ Technologies Used
- **Programming Language:** Java
- **Concepts:** Variables, data types, conditional statements (`if`, `else if`, `else`), nested conditions, and comparison operators.

## 💻 Source Code

```java
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
```

## 📤 Sample Output

```text
Payment success
Account khali ho gaya
```

## ▶️ How to Run

1. Install the Java Development Kit (JDK).
2. Save the source code in a file named `Task3.java`.
3. Open a terminal in the folder containing the file.
4. Compile the program:

   ```bash
   javac Task3.java
   ```

5. Run the program:

   ```bash
   java Task3
   ```

## 🧪 Test Cases

| Amount | Balance | Expected Result |
|---:|---:|---|
| 5000 | 5000 | Payment success; account becomes empty |
| 6000 | 5000 | Payment failed |
| -100 | 5000 | Amount negative |
| 2000 | 5000 | Payment success |

## 🎯 Learning Objectives
- Understand Java conditional statements.
- Apply nested `if` statements.
- Validate payment amounts against account balances.
- Practice basic program logic and decision-making.

## 👨‍💻 Author
**Bhagyesh Patil**

---

⭐ If you find this project useful, consider giving the repository a star!