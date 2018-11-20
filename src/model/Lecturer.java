package model;

public class Lecturer extends Person{
	
	private String course;
	
	public Lecturer() {}
	
	public boolean isValidId(String id) {
		return id.matches("[0-9]{8}");
	}
	
	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	public String[] getCol() {
		return new String[] {"Lecturer ID", "Lecturer Name", "Lecturer Age", "Lecturer Email", "Lecturer Course"};
	}
}
