
public class Calculator {

    private int total = 0;

    // Reset the calculator to zero
    public void reset() {
        total = 0;
    }

    // Add a positive integer to the calculator
    // If the number is negative, throw an exception

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
