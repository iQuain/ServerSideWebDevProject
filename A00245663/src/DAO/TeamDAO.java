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
import model.Team;

public enum TeamDAO {

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
	
	public void save(Team team) throws SQLException, ClassNotFoundException {
		Connection con = getConnection();
		
		Statement stmt = con.createStatement();
		stmt.executeUpdate("INSERT INTO TEAMS(NAME, REGION) "
				+ "VALUES ('" + team.getName() + "','" + team.getRegion() + "')");
		stmt.close();
		con.close();
	}
	
	public List<Team> list() throws ClassNotFoundException, SQLException {
		Connection con = getConnection();
		
		List<Team> teamList = new ArrayList<Team>();
		try {
			PreparedStatement psmt = con.prepareStatement("SELECT * FROM teams");
			
			ResultSet rs = psmt.executeQuery();
			
			while(rs.next()) {
				Team t = new Team(rs.getString("name"),rs.getString("region"));
				teamList.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teamList;
	}
	
}
