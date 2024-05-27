package LabQuestions;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert",1994, 50000.0,"64C- WallsStreat");
        Employee employee2 = new Employee("Sam", 2000,60000.0,"68D- WallsStreat");
        Employee employee3 = new Employee("John", 1999, 55000.0,"26B- WallsStreat");

        System.out.println("Name \tYear of joining\t\tAddress");
        employee1.display();
        employee2.display();
        employee3.display();
    }
}
