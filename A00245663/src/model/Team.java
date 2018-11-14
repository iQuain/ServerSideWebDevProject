package model;

public class Team {

	private int teamId = 0;
	private String name = "";
	private String region = "";
	
	public Team(String n, String r) {
		this.name = n;
		this.region = r;
	}
	
	public Team(int i, String n, String r) {
		this.teamId = i;
		this.name = n;
		this.region = r;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
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
