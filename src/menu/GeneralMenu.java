package menu;

import java.util.ArrayList;

public class GeneralMenu {
	
	private ArrayList<String> menu;
	
	private String line;

	public GeneralMenu() {
		menu = new ArrayList<String>();
		line = "===================";
	}
	
	public void addItem(String item) {
		menu.add(item);
	}
	
	public void printMenu() {
		System.out.println(line);
		for(int i = 0; i < menu.size(); i++) {
			System.out.println(i+1 + ". " + menu.get(i));
		}
		System.out.println(line);
	}
}
