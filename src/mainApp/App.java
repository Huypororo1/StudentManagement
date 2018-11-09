package mainApp;

import util.InputData;

public class App {
	
	private StudentController stController;
	private LecturerController lecController;
	private String decor;
	
	public App(){
		stController = new StudentController();
		lecController = new LecturerController();
		decor = "===================";
	}
	
	public static void main(String[] args) {
		App app = new App();
		app.beginApp();
	}
	
	public void beginApp() {
		String a = "";
		while(!a.equals("3")) {
			a = mainMenu();
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
		
	public void showMainMenu(){
		System.out.println(decor);
		System.out.println("1) Manager Students.");
		System.out.println("2) Manager lecturers.");
		System.out.println("3) Exit.");
		System.out.println(decor);
		System.out.print("Choose (1 -> 3): \n");
	}
	
	public String mainMenu() {
		showMainMenu();
		return InputData.scanString("Input: ");
	}
}
