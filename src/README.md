# Bank Account CLI (Main.java)

A simple command-line bank account program written in Java. It demonstrates basic input/output, simple account operations (deposit, withdraw, show balance), and a menu-driven loop. The main implementation is in `src/Main.java`.

Source: [src/Main.java](https://github.com/Anjali-2652/Java/blob/b4ffd58eb31abef91e732e249b6c153e1fdabe43/src/Main.java)

## Features
- Deposit an amount to the account
- Withdraw an amount (with insufficient-balance check)
- Show current balance
- Interactive menu-driven CLI

## Requirements
- Java Development Kit (JDK) 8 or newer
- A terminal / command prompt

## Build & Run

From the repository root:

1. Compile:
```
javac src/Main.java
```

2. Run:
```
java -cp src Main
```

Notes:
- The program uses the default package, so the compiled `.class` file will be placed in the current directory structure under `src`.
- If you prefer, compile and run in one line:
```
javac src/Main.java && java -cp src Main
```

## Usage

When you run the program, you'll see a menu like:

1. Deposit  
2. Withdraw  
3. Show Balance  
4. Exit

Enter the numeric choice and follow the prompts to perform operations.

Example session:
```
-----Bank Account Menu-----
1. Deposit
2. Withdraw
3. Show Balance
4. Exit
Choose an option:
1
Enter deposit amount:
100
Deposited amount is: 100.0

-----Bank Account Menu-----
...
3
Total Amount is :100.0
...
4
Exiting.... Thank You!!
```

## Known issues and recommended fix
- Current behavior: Choosing option `4` prints the exit message but does not terminate the menu loop (the program keeps running).
- Recommended fix: after printing the exit message, close the `Scanner` and break out of the loop.

Replace the exit branch in `src/Main.java` with:
```java
} else if (choice == 4) {
    System.out.println("Exiting.... Thank You!!");
    sc.close();
    break;
}
```

Other possible improvements:
- Validate user input to handle non-numeric entries without throwing exceptions.
- Format currency output.
- Persist balance to a file so the account survives program restarts.
- Add unit tests and modularize the code (e.g., separate BankAccount class and CLI).

## Files
- `src/Main.java` — the interactive CLI program (linked above).

## Contributing
Feel free to open issues or submit pull requests to:
- add input validation
- improve the user interface
- add persistence or tests

