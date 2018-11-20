package controller;

import menu.LecturerMenu;
import model.Lecturer;
import model.Person;
import util.ArrayUtil;
import util.InputData;
import util.Table;

public class LecturerController extends PersonController{
	
	private LecturerMenu menu;
	private Table table;
	
	public LecturerController() {
		menu = new LecturerMenu();
		table = new Table(new Lecturer().getCol());
	}
	
	public String mainMenu() {
		menu.printMenu();
		return super.mainMenu();
	}
	
	public void printPerson(Person person) {
		Lecturer lec = (Lecturer)person;
		String[] data = ArrayUtil.combine(getValues(person), new String[] {lec.getCourse()});
		table.drawText(data);
		table.drawLine(data);
	}
	
	public void drawHeader() {
		table.drawHeader();
	}
	
	public Lecturer setPerson(Person person) {
		Lecturer lec = (Lecturer)super.setPerson(person);
		lec.setCourse(InputData.scanString("Enter course: "));
		return lec;
	}
	
	public Lecturer createInstance() {
		return new Lecturer();
	}

}
