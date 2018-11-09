package util;

import java.util.Scanner;

public class InputData {
	
	private static Scanner scan = new Scanner(System.in);
	
	public static String scanString(String str) {
		System.out.print(str);
		return scan.nextLine();
	}
}
