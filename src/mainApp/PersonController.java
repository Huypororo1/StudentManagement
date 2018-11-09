package mainApp;

import java.util.ArrayList;

import util.InputData;

public abstract class PersonController {
	
	private String decor;
	
	public PersonController() {
		decor = "===================";
	}
	
	public String mainMenu() {
		printMenu();
		return InputData.scanString("Input: ");
	}
	
	public void printMenuDetail(String[] menu) {
		System.out.println(decor);
		for(int i = 0; i < menu.length; i++ ) {
			System.out.println(i+1 + ") " + menu[i]);
		}
		System.out.println(decor);
		System.out.println("Choose (1 -> 6): ");
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
		}
	}
	
	public void add() {
		Person person = createInstance();
		addList(setPerson(person));
	}
	
	public String toStringPerson(Person person) {
		return "Id: " + person.getId() + ", Name: " + person.getName() + ", Age: " + person.getAge() + ", Email: " + person.getEmail();
	};
	
	public void view() {
		for(int i = 0; i < getList().size(); i++) {
			printPerson(getList().get(i));
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
		for(int i = 0; i < getList().size(); i++) {
			String b = getList().get(i).getId();
			if(b.equals(id)) {
				printPerson(getList().get(i));
				return i;
			}
		}
		return -1;
	}
	
	public void delete() {
		String a = InputData.scanString("Enter ID Need Delete: ");
		int index = find(a);
		if(index != -1) getList().remove(index);
	}
	
	public void update() {
		String a = InputData.scanString("Enter ID Need Update: ");
		int i = find(a);
		if(i != -1) {
			updateList(i, setPerson(getList().get(i)));
		}
	}
	
	public abstract void printMenu();	
	public abstract Person createInstance();	
	public abstract void printPerson(Person person);	
	public abstract ArrayList<? extends Person> getList();
	public abstract void addList(Person person);
	public abstract void updateList(int index, Person person);
}
