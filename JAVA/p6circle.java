//Create a class “Circle” with-
//1) private variables x, y, and r
//Here x and y are coordinates of center of circle and r is a radius
//2) Define all possible constructors.
//3) Define a method – public double area() which is calculate and return area of a
//circle.
//4) Define a method – public double circumference() which is calculate and return
//perimeter of a circle.
//5) Define a method – public double diameter() which is calculate and return
//diameter of a circle

import java.util.Scanner;

class p6circle {
    private double x;
    private double y;
    private double r;
    
    public p6circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    public p6circle(double r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    public p6circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public double area() {
        return Math.PI * r * r;
    }

    public double circumference() {
        return 2 * Math.PI * r;
    }

    public double diameter() {
        return 2 * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter x, y and radius for circle1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        p6circle circle1 = new p6circle(x1, y1, r1);
        System.out.println("Circle1 Area: " + circle1.area());
        System.out.println("Circle1 Circumference: " + circle1.circumference());
        System.out.println("Circle1 Diameter: " + circle1.diameter());

        System.out.println("Enter radius for circle2:");
        double r2 = scanner.nextDouble();
        p6circle circle2 = new p6circle(r2);
        System.out.println("Circle2 Area: " + circle2.area());
        System.out.println("Circle2 Circumference: " + circle2.circumference());
        System.out.println("Circle2 Diameter: " + circle2.diameter());

        System.out.println("Enter x, y and radius for circle3:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double r3 = scanner.nextDouble();
        p6circle circle3 = new p6circle(x3, y3, r3);
        System.out.println("Circle3 Area: " + circle3.area());
        System.out.println("Circle3 Circumference: " + circle3.circumference());
        System.out.println("Circle3 Diameter: " + circle3.diameter());

        scanner.close();
    }
}
