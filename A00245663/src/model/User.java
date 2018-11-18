package model;

public class User {
	
	private int id = 0;
	private String name = "";
	private String password = "";
	
	public User(int i, String n, String p) {
		this.id = i;
		this.name = n;
		this.password = p;
	}
	
	public User(String n, String p) {
		this.name = n;
		this.password = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
