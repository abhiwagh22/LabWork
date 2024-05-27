/*Write a Java program to create a class called Shape with a method called getArea().
Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle. */

package LabQuestions;

class Shape {
 
 public double getArea() {
     return 0.0;
 }
}
class Rectangle extends Shape {
 public double length;
 public  double width;

 public Rectangle(double length, double width) {
     this.length = length; 
     this.width = width;
 }

 public double getArea() {
     return length * width; // Area of rectangle = length * width
 }
}

public class RectangleArea{
 public static void main(String[] args) {
	 
     Rectangle rectangle = new Rectangle(5.0, 4.0);

     System.out.println("Area of the rectangle: " + rectangle.getArea());
 }
}
