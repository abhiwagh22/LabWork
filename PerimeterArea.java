/*Write a Java program to create a class called Shape with methods called getPerimeter() and getArea().
  Create a subclass called Circle that overrides the getPerimeter() and getArea() 
  methods to calculate the area and perimeter of a circle.
 */


package LabQuestions;

class Shape2 {
 public double getPerimeter() { 
     return 0.0; 
 }
 public double getArea() {
     return 0.0;
 }
}
class Circle extends Shape2 {
 public double radius;

 public Circle(double radius) {
     this.radius = radius;
 }
 public double getPerimeter() {
     return 2 * Math.PI * radius; 
 }
 public double getArea() {
     return Math.PI * radius * radius; 
 }
}

public class PerimeterArea{
 public static void main(String[] args) {
	 
     Circle circle = new Circle(5.0);

     System.out.println("Perimeter of the circle: " + circle.getPerimeter());
     System.out.println("Area of the circle: " + circle.getArea());
 }
}

