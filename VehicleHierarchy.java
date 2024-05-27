/* Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, 
with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as
make, model, year, and fuel type. Implement methods for calculating 
fuel efficiency, distance traveled, and maximum speed.   */

package LabQuestions;

class Vehicle {
 
 protected String make;
 protected String model;
 protected int year;
 protected String fuelType;

 public Vehicle(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 public double calculateFuelEfficiency(double distance, double fuelConsumed) {
     if (fuelConsumed <= 0) {
         return 0;
     }
     return distance / fuelConsumed;
 }

 
 public double calculateDistance(double time, double speed) {
     return time * speed;
 }

 public double getMaxSpeed() {
	return 0;
}
}

class Truck extends Vehicle {
	
 private double cargoCapacity;

 public Truck(String make, String model, int year, String fuelType, double cargoCapacity) {
     super(make, model, year, fuelType);
     this.cargoCapacity = cargoCapacity;
 }

 public double getMaxSpeed() {
     return 80; 
 }
}

class Car extends Vehicle {
 private int passengerCapacity; 
 
 public Car(String make, String model, int year, String fuelType, int passengerCapacity) {
     super(make, model, year, fuelType);
     this.passengerCapacity = passengerCapacity;
 }

 public double getMaxSpeed() {
     // Assuming a maximum speed for cars
     return 120; // mph
 }
}

class Motorcycle extends Vehicle {
 private boolean hasFairing; 

 public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
     super(make, model, year, fuelType);
     this.hasFairing = hasFairing;
 }

 public double getMaxSpeed() {
    
     return 150; 
 }
}

public class  VehicleHierarchy {
 public static void main(String[] args) {
    
     Truck truck = new Truck("Ford", "F-150", 2020, "Diesel", 2.5);
     Car car = new Car("Toyota", "Camry", 2019, "Petrol", 5);
     Motorcycle motorcycle = new Motorcycle("Honda", "CBR1000RR", 2021, "Petrol", true);

     displayVehicleInfo(truck);
     displayVehicleInfo(car);
     displayVehicleInfo(motorcycle);
 }
 public static void displayVehicleInfo(Vehicle vehicle) {
     System.out.println("Make: " + vehicle.make);
     System.out.println("Model: " + vehicle.model);
     System.out.println("Year: " + vehicle.year);
     System.out.println("Fuel Type: " + vehicle.fuelType);
     System.out.println("Max Speed: " + vehicle.getMaxSpeed() + " mph");
     System.out.println();
 }
}

