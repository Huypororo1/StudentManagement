package controller;

import java.util.ArrayList;

import model.Person;
import util.InputData;

public abstract class PersonController {
	
	private ArrayList<Person> list;
	
	public PersonController() {
		list = new ArrayList<Person>();
	}
	
	public String mainMenu() {
		return InputData.scanString("Input: ");
	}
	
	public void begin() {
		String a = "";
		while(!a.equals("6")) {
			a = mainMenu();
			switch(a) {
				case "1": add(); break;
				case "2": view(); break;
				case "3": delete(); break;
				case "4": search(); break;
				case "5": update(); break;
			}
			if(!a.equals("6")) {
				InputData.scanString("Press Enter to return...");
			}
			System.out.println("");
		}
	}
	
	public void add() {
		Person person = createInstance();
		list.add(setPerson(person));
	}
	
	public String[] getValues(Person person) {
		return new String[]{person.getId(), person.getName(), person.getAge(), person.getEmail()};
	};
	
	public void view() {
		if(list.size() == 0) {
			System.out.println("There is no data.");
			return;
		}
		drawHeader();
		for(int i = 0; i < list.size(); i++) {
			printPerson(list.get(i));
		}
	}
	
	public Person setPerson(Person person) {
		do {
			person.setId(InputData.scanString("Enter ID: "));
		} while(person.getId() == null);
		person.setName(InputData.scanString("Enter Name: "));
		person.setAge(InputData.scanString("Enter Age: "));
		person.setEmail(InputData.scanString("Enter Email: "));
		return person;
	}
	
	public void search() {
		String a = InputData.scanString("Enter ID Need Search: ");
		find(a);
	}
	
	public int find(String id) {
		for(int i = 0; i < list.size(); i++) {
			String b = list.get(i).getId();
			if(b.equals(id)) {
				drawHeader();
				printPerson(list.get(i));
				return i;
			}
		}
		System.out.println("Nothing is found.");
		return -1;
	}
	
	public void delete() {
		String a = InputData.scanString("Enter ID Need Delete: ");
		int index = find(a);
		if(index != -1) list.remove(index);
	}
	
	public void update() {
		String a = InputData.scanString("Enter ID Need Update: ");
		int i = find(a);
		if(i != -1) {
			list.set(i, setPerson(list.get(i)));
		}
	}
		
	public abstract Person createInstance();	
	public abstract void printPerson(Person person);
	public abstract void drawHeader();
}
