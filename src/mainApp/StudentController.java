package mainApp;

import java.util.ArrayList;

import util.InputData;

public class StudentController extends PersonController {
	
	private String[] menu;
	private ArrayList<Student> students;
	
	public StudentController(){
		menu = new String[] {"Add Student.", "View Student.", "Delete Student.", "Search Student.","Update Student.", "Back to menu."};
		students = new ArrayList<Student>();
	}
	
	public void printMenu() {
		System.out.println("Student Manager");
		printMenuDetail(menu);
	}
	
	public void printPerson(Person person) {
		Student stu = (Student)person;
		String stuInfo = super.toStringPerson(person);
		System.out.println(stuInfo + ", Phone: " + stu.getPhone() + "\n");
	}
	
	public Student setPerson(Person person) {
		Student stu = (Student)super.setPerson(person);
		stu.setPhone(InputData.scanString("Enter phone: "));
		return stu;
	}
	
	public ArrayList<? extends Person> getList(){
		return students;
	}
	
	public Student createInstance() {
		return new Student();
	}
	
	public void addList(Person person) {
		students.add((Student)person);
	}

	public void updateList(int index, Person person) {
		students.set(index, (Student)person);		
	}
}
