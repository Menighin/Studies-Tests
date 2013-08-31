package model;

import java.util.ArrayList;


public class Person {
	
	private String name;
	private String tel;
	private String email;
	
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
	
	public static void insertAgenda (Person p) {
		//TODO implement method that persists Person on database
	}
	
	public static ArrayList<Person> searchAgenda (String name) {
		ArrayList<Person> ap = new ArrayList<Person>();
		
		//TODO implement search for name in database
		
		return ap;
	}
	
	public static ArrayList<Person> returnAgenda () {
		ArrayList<Person> ap = new ArrayList<Person>();
		
		//TODO return the whole agenda
		
		return ap;
	}
	
}
