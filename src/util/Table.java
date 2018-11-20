package util;

public class Table {
	
	private String[] headers;
	
	public Table(String[] headers) {
		this.headers = headers;
	}
	
	public void drawHeader() {
		drawLine(headers);
		drawText(headers);
		drawLine(headers);
	}
	
	public void drawLine(String[] arr) {
		String line = "|";
		for(String item : arr) {
			int width = item.length() > 30 ? item.length() : 30; 
			for(int i = 0; i < width; i++) {
				line += "-";
			}
			line += "|";
		}
		System.out.println(line);
	}
	
	public void drawText(String[] arr) {
		for(String item : arr) {
			int width = item.length() > 30 ? item.length() : 29;
			System.out.printf("| %-" + width + "s" , item);
		}
		System.out.println("|");
	}
}
