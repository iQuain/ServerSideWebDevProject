package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
		stmt.executeUpdate("INSERT INTO PLAYERS(NAME, PASSWORD, TEAM) "
				+ "VALUES ('" + player.getUsername() + "','"
				+ player.getPassword() + "','" + player.getTeam() + "')");
		stmt.close();
		con.close();
	}
	
}
