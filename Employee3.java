
package LabQuestions;

public class Employee3 {
    
    //Field
    private int eid;
    private String ename;
    private double esalary;
    
    // Constructor
    public Employee3(int eid, String ename, double esalary) {
        super();
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }
    
    //Getters and Setters
    
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public double getEsalary() {
        return esalary;
    }
    public void setEsalary(double esalary) {
        this.esalary = esalary;
    }
    
    // toString() method to print Employee details

    @Override
    
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", esalary=" + esalary +
                '}';
    }
    
    // Main method
    public static void main(String[] args) {
        // Creating an Employee object
        Employee3 employee = new Employee3(1, "John Doe", 50000.0);
        
        // Printing employee details using toString() method
        System.out.println("Employee Details:");
        System.out.println(employee);
    }
}
