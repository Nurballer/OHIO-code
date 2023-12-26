import models.Point;
import models.Shape;

public class MyApplication {
    public static void main(String[] args) {
        // Create 10 random points
        Point[] points = new Point[10];
        for (int i = 0; i < points.length; i++) {
            double x = Math.random() * 100;  // Random x coordinate between 0 and 100
            double y = Math.random() * 100;  // Random y coordinate between 0 and 100
            points[i] = new Point(x, y);
        }

        // Create a shape using the array of points
        Shape shape = new Shape(points);

        // Test your methods
        System.out.println("Perimeter: " + shape.perimeter());
        System.out.println("Longest Side: " + shape.longestSide());
        System.out.println("Average Side: " + shape.averageSide());
    }
}
