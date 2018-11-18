package model;

public class Player {

	private int id = 0;
	private String username = "";
	private String team = "";
	private String car = "";
	
	public Player(int i, String u, String t, String c) {
		this.id = i;
		this.username = u;
		this.team = t;
		this.car = c;
	}
	
	public Player(String u, String t, String c) {
		this.username = u;
		this.team = t;
		this.car = c;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getId() {
		return id;
	}

	public void setId(int playerId) {
		this.id = playerId;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
}
