package controller;

import menu.StudentMenu;
import model.Person;
import model.Student;
import util.ArrayUtil;
import util.InputData;
import util.Table;

public class StudentController extends PersonController {
	
	private StudentMenu menu;
	private Table table;
	
	public StudentController(){
		menu = new StudentMenu();
		table = new Table(new Student().getCol());
	}
	
	public String mainMenu() {
		menu.printMenu();
		return super.mainMenu();
	}
	
	public void printPerson(Person person) {
		Student stu = (Student)person;
		String[] data = ArrayUtil.combine(getValues(person), new String[] {stu.getPhone()});
		table.drawText(data);
		table.drawLine(data);
	}
	
	public void drawHeader() {
		table.drawHeader();
	}
	
	public Student setPerson(Person person) {
		Student student = (Student)super.setPerson(person);
		student.setPhone(InputData.scanString("Enter phone: "));
		return student;
	}
	
	public Student createInstance() {
		return new Student();
	}

}
