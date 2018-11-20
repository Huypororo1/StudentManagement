package model;

public abstract class Person {
	
	private String id, name, age, email;
	
	public Person() {}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		if(isValidId(id)) this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public abstract boolean isValidId(String id);
	
}
