package mainApp;

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
}
