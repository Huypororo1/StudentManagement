package model;

public class Student extends Person{
	private String phone;
	
	public Student() {}
	
	public boolean isValidId(String id) {
		return id.matches("GCS[0-9]{5}");
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String[] getCol() {
		return new String[] {"Student ID", "Student Name", "Student Age", "Student Email", "Student Phone"};
	}

}
