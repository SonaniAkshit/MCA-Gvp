import java.util.Scanner;

class circle {
    private double x;
    private double y;
    private double r;
    
    public circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1;
    }

    // Constructor with radius only
    public circle(double r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    // Constructor with coordinates and radius
    public circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Method to calculate the area of the circle
    public double area() {
        return Math.PI * r * r;
    }

    // Method to calculate the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * r;
    }

    // Method to calculate the diameter of the circle
    public double diameter() {
        return 2 * r;
    }

    // Main method for testing with user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input x, y, and r for circle1
        System.out.println("Enter x, y and radius for circle1:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double r1 = scanner.nextDouble();
        circle circle1 = new circle(x1, y1, r1);
        System.out.println("Circle1 Area: " + circle1.area());
        System.out.println("Circle1 Circumference: " + circle1.circumference());
        System.out.println("Circle1 Diameter: " + circle1.diameter());

        // Input radius for circle2
        System.out.println("Enter radius for circle2:");
        double r2 = scanner.nextDouble();
        circle circle2 = new circle(r2);
        System.out.println("Circle2 Area: " + circle2.area());
        System.out.println("Circle2 Circumference: " + circle2.circumference());
        System.out.println("Circle2 Diameter: " + circle2.diameter());

        // Input x, y, and r for circle3
        System.out.println("Enter x, y and radius for circle3:");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double r3 = scanner.nextDouble();
        circle circle3 = new circle(x3, y3, r3);
        System.out.println("Circle3 Area: " + circle3.area());
        System.out.println("Circle3 Circumference: " + circle3.circumference());
        System.out.println("Circle3 Diameter: " + circle3.diameter());

        scanner.close();
    }
}
