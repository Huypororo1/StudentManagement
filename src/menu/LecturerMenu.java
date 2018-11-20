package menu;

public class LecturerMenu extends GeneralMenu {
	
	public LecturerMenu() {
		String[] menu = new String[] {"Add Lecturer.", "View Lecturer.","Delete Lecturer", "Search Lecturer", "Update Lecturer", "Back to Main Menu"};
		for(int i = 0; i < menu.length; i++) {
			addItem(menu[i]);
		}
	}
	
	public void printMenu() {
		System.out.println("LECTURER MANAGEMENT");
		super.printMenu();
		System.out.println("Choose (1 -> 6): ");
	}
}
