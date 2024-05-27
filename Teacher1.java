package LabQuestions;
//implements the teacher class
public class Teacher1 implements person {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("I am Teacher.");
			
		}
	public static void main(String []args ) {
		//create objectsf both student and teacher classes
		Student1 Student = new Student1();
		Teacher1 Teacher = new Teacher1();
		
		// call their respective "speak" methods
		Student.speak();
		Teacher.speak();
		
		
		
	}
	

}
