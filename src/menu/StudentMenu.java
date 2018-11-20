package menu;

public class StudentMenu extends GeneralMenu {
	
	public StudentMenu() {
		String[] menu = new String[] {"Add Student", "View Student.","Delete Student.", "Search Student.", "Update Student.", "Back to Main Menu."};
		for(int i = 0; i < menu.length; i++) {
			addItem(menu[i]);
		}
	}
	
	public void printMenu() {
		System.out.println("STUDENT MANAGEMENT");
		super.printMenu();
		System.out.println("Choose (1 -> 6): ");
	}
	
}
