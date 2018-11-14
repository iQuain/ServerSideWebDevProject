package model;

public class Player {

	private int playerId = 0;
	private String username = "";
	private String password = "";
	private String team = "";
	
	public Player(String u, String p, String t) {
		this.username = u;
		this.password = p;
		this.team = t;
	}
	
	public Player(int i, String u, String p, String t) {
		this.playerId = i;
		this.username = u;
		this.password = p;
		this.team = t;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
}
