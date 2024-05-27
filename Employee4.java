package LabQuestions;

class Employee4 extends Person1 {
    private String designation;

	public Employee4(int id, String name, double salary, String designation) {
        super(id, name, salary);
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Designation: " + designation);
    }
    public static void main(String[] args) {
        Manager manager = new Manager(101, "Abhi Wagh ", 75000.0, "Software Developer");
        Employee4 employee = new Employee4(201, "Tejas Sinde", 50000.0, "HR");

        manager.displayDetails();
        System.out.println();
        employee.displayDetails();
    }

}