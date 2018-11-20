package menu;

public class AppMenu extends GeneralMenu {
	
	public AppMenu() {
		String[] menu = new String[] {"Manage Student", "Manage Lecturer", "Exit"};
		for(int i = 0; i < menu.length; i++) {
			addItem(menu[i]);
		}
	}
	
	public void printMenu() {
		System.out.println("SCHOOL MANAGEMENT");
		super.printMenu();
		System.out.println("Choose (1 -> 3): ");
	}
}
