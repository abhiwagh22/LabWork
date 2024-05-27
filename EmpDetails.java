//Create Emp details eid,ename,companyname using static variable,static method?

package LabQuestions;

public class EmpDetails {
    private static int eid;
    private static String ename;
    private static String companyName;

    public static void setDetails(int id, String name, String company) {
        eid = id;
        ename = name;
        companyName = company;
    }

    public static void displayDetails() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Company Name: " + companyName);
    }

    public static void main(String[] args) {
        // Set employee details
        setDetails(101, "Abhi wagh", "ABC Compony");

        // Display employee details
        System.out.println("Employee Details:");
        displayDetails();
       
    }
}

