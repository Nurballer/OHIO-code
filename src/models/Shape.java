package models;

import models.Point;

public class Shape {
    private Point[] points;

    // Constructor to initialize a shape with an array of points
    public Shape(Point[] points) {
        this.points = points;
    }

    // Calculate and return the perimeter of the shape
    public double perimeter() {
        double perimeter = 0;
        for (int i = 0; i < points.length - 1; i++) {
            perimeter += points[i].distanceTo(points[i + 1]);
        }
        perimeter += points[points.length - 1].distanceTo(points[0]);  // Closing the shape
        return perimeter;
    }

    // Find and return the length of the longest side in the shape
    public double longestSide() {
        double longest = 0;
        for (int i = 0; i < points.length - 1; i++) {
            double sideLength = points[i].distanceTo(points[i + 1]);
            if (sideLength > longest) {
                longest = sideLength;
            }
        }
        return longest;
    }

    // Calculate and return the average length of the sides in the shape
    public double averageSide() {
        double totalLength = perimeter();
        return totalLength / points.length;
    }
}
