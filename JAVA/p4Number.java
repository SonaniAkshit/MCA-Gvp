//Create class Number with only one private instance variable as a double
//primitive type. To include the following methods (include respective
//constructors) isZero(), isPositive(), isNegative( ), isOdd( ), isEven( ), the above
//methods return boolean type and getFactorial(), the above method returns
//double  type.

import java.util.Scanner;

public class p4Number {

    private double value;

    public p4Number(double value) {
        this.value = value;
    }

    public boolean isZero() {
        return value == 0;
    }

    public boolean isPositive() {
        return value > 0;
    }

    public boolean isNegative() {
        return value < 0;
    }

    public boolean isOdd() {
        return ((int)value) % 2 != 0;
    }

    public boolean isEven() {
        return ((int)value) % 2 == 0;
    }

    public double getFactorial() {
        if (value < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        return factorial((int)value);
    }

    private double factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double inputValue = scanner.nextDouble();

        p4Number num = new p4Number(inputValue);

        System.out.println("Is Zero: " + num.isZero());
        System.out.println("Is Positive: " + num.isPositive());
        System.out.println("Is Negative: " + num.isNegative());
        System.out.println("Is Odd: " + num.isOdd());
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Factorial: " + num.getFactorial());

        scanner.close();
    }
}
