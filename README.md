
# Calculator Project

This is a simple Java calculator program.

The calculator can:
- Add positive integers
- Reset the total to zero
- Show the current total
- Throw an exception if a negative number is entered

This project was created for Assignment 4.2:
AI-Assisted Coding.



## How the Calculator Works

The Calculator class is a simple Java program
that keeps track of a running total.

It contains three main methods:

- reset(): Resets the total to zero.
- add(int number): Adds a number to the total.
  If the number is negative, an exception is thrown.
- getTotal(): Returns the current total.

The total variable stores the current sum.
It starts at zero.

## Example

```java
Calculator calc = new Calculator();

calc.add(5);
calc.add(10);

System.out.println(calc.getTotal()); // 15

calc.reset();

System.out.println(calc.getTotal()); // 0
```

## GitHub Copilot

I used GitHub Copilot to help explain how my
Calculator class works.

Copilot generated explanations of the methods.
I reviewed the explanations and made them
shorter and easier to understand.


## Calculator Source Code

```java
public class Calculator {

    private int total = 0;

    // Reset the calculator to zero
    public void reset() {
        total = 0;
    }

    // Add a positive integer
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot add negative numbers.");
        }
        total += number;
    }

    // Return the current total
    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        calc.add(5);
        calc.add(10);
        calc.add(3);

        System.out.println("Total: " + calc.getTotal());

        calc.reset();

        System.out.println("After reset: " + calc.getTotal());

        calc.add(7);
        calc.add(8);

        System.out.println("New total: " + calc.getTotal());
    }
}
```
