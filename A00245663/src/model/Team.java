package model;

public class Team {

	private String name = "";
	private String region = "";
	
	public Team(String n, String r) {
		this.name = n;
		this.region = r;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
