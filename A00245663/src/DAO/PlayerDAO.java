package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;

public enum PlayerDAO {

	instance;
	
	public Connection getConnection() throws SQLException, ClassNotFoundException{
		try {
			Connection con;
			Class.forName("org.hsqldb.jdbcDriver");
			con = DriverManager.getConnection(
			"jdbc:hsqldb:hsql://localhost/oneDB","sa", "");
			return con;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void save(Player player) throws SQLException, ClassNotFoundException {
		Connection con = getConnection();
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate("INSERT INTO PLAYERS(NAME, TEAM, CAR) "
				+ "VALUES ('" + player.getUsername() + "','"
				+ player.getTeam() + "','" + player.getCar() + "')");
		stmt.close();
		con.close();
	}
	
	public List<Player> list() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		
		List<Player> playerList = new ArrayList<Player>();
		try {
			PreparedStatement psmt = con.prepareStatement("SELECT * FROM players ORDER BY team");
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
				playerList.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return playerList;
	}
	
	public List<Player> searchName(String name) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		
		List<Player> playerList = new ArrayList<Player>();
		
		if(name.equals("") || name == null) {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players ORDER BY team");
				
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players WHERE NAME = ?");
				psmt.setString(1, name);
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return playerList;
	}
	
	public List<Player> searchCar(String car) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		
		List<Player> playerList = new ArrayList<Player>();
		
		if(car.equals("") || car == null) {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players ORDER BY car");
				
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players WHERE CAR = ?");
				psmt.setString(1, car);
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return playerList;
	}
	
	public List<Player> searchTeam(String team) throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		
		List<Player> playerList = new ArrayList<Player>();
		
		if(team.equals("") || team == null) {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players ORDER BY team");
				
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			try {
				PreparedStatement psmt = con.prepareStatement("SELECT * FROM players WHERE TEAM = ?");
				psmt.setString(1, team);
				ResultSet rs = psmt.executeQuery();
				
				while(rs.next()) {
					Player p = new Player(rs.getInt("id"), rs.getString("name"),rs.getString("team"), rs.getString("car"));
					playerList.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return playerList;
	}
	
}
