package mainApp;

import controller.LecturerController;
import controller.StudentController;
import menu.AppMenu;
import util.InputData;

public class App {
	
	private StudentController stController;
	private LecturerController lecController;
	private AppMenu menu;
	
	public App(){
		stController = new StudentController();
		lecController = new LecturerController();
		menu = new AppMenu();
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.beginApp();
		System.out.print("The application is closed.");
	}
	
	public void beginApp() {
		String a = "";
		while(!a.equals("3")) {
			a = mainMenu();
			System.out.println();
			switch(a) {
			case "1":
				stController.begin();
				break;
			case "2":
				lecController.begin();
				break;
			}
		}
	}
	
	public String mainMenu() {
		menu.printMenu();
		return InputData.scanString("Input: ");
	}
}
