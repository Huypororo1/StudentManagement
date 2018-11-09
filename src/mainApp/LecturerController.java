package mainApp;

import java.util.ArrayList;

import util.InputData;

public class LecturerController extends PersonController{
	
	private String[] menu;
	private ArrayList<Lecturer> lecturers;
	
	public LecturerController() {
		menu = new String[] {"Add Lecturers.", "View Lecturers.","Delete Lecturers.", "Search Lecturers.", "Update Lecturers.", "Back to menu."};
		lecturers = new ArrayList<Lecturer>();
	}
	
	public void printMenu() {
		System.out.println("Lecturers Manager");
		printMenuDetail(menu);
	}
	
	public void printPerson(Person person) {
		String lecInfo = super.toStringPerson(person);
		Lecturer lec = (Lecturer)person;
		System.out.println(lecInfo + ", Course: " + lec.getCourse() + "\n");
	}
	
	public Lecturer setPerson(Person person) {
		Lecturer lec = (Lecturer)super.setPerson(person);
		lec.setCourse(InputData.scanString("Enter course: "));
		return lec;
	}
	
	public ArrayList<Lecturer> getList(){
		return lecturers;
	}
	
	public Lecturer createInstance() {
		return new Lecturer();
	}
	
	public void addList(Person person) {
		lecturers.add((Lecturer)person);
	}

	public void updateList(int index, Person person) {
		lecturers.set(index, (Lecturer)person);
	}
}
