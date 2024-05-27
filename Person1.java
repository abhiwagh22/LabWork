package LabQuestions;
//WAP to implement abstract methods for class person(id,name,salary) and 
//subclass manager and Employee .(add your own attributes of choice)
abstract class Person1 {
    protected int id;
    protected String name;
    protected double salary;

    public Person1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public abstract void displayDetails();
}





