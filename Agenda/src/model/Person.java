package model;

import java.util.ArrayList;
import java.sql.*;

public class Person {
	
	private String name;
	private String tel;
	private String email;
	private static Connection c;
	private static Statement stmt;
	
	public Person (Person p) {
		this.name = p.getName();
		this.tel = p.getTel();
		this.email =p.getEmail();
	}
	
	public Person(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public Person () {}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Nome: " + name + "\nTel: " + tel + "\nE-mail: " + email + "\n";
	}
	
	
	
	public static void Connect() throws Exception {
		Class.forName("org.sqlite.JDBC");
		
		c = DriverManager.getConnection("jdbc:sqlite:Agenda.db");
		stmt = c.createStatement();
		
		String sql = "CREATE TABLE IF NOT EXISTS persons  (" +
					 "id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " +
					 "name TEXT NOT NULL, " +
					 "tel TEXT NOT NULL, " +
					 "email TEXT NOT NULL)";
		stmt.executeUpdate(sql);
	}
	
	public static void insertAgenda (Person p) throws Exception {
		String sql = "INSERT INTO persons (name, tel, email) VALUES ('" +
					 p.getName() + "', '" + p.getTel() + "', '" + p.getEmail() + "')";
		stmt.executeUpdate(sql);
	}
	
	public static ArrayList<Person> searchAgenda (String name) throws Exception {
		ArrayList<Person> ap = new ArrayList<Person>();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM persons WHERE name LIKE '%" + name + "%'");
		while (rs.next()) {
			ap.add(new Person (rs.getString("name"), rs.getString("tel"), rs.getString("email")));
		}
		
		return ap;
	}
	
	public static ArrayList<Person> returnAgenda() throws Exception {
		ArrayList<Person> ap = new ArrayList<Person>();
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM persons");
		while (rs.next()) {
			ap.add(new Person (rs.getString("name"), rs.getString("tel"), rs.getString("email")));
		}
		
		return ap;
	}
	
	public static void Disconnect() throws Exception {
		stmt.close();
		c.close();
	}
}
