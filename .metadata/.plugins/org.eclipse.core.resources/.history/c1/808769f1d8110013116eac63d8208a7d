package controller;

public class Person {
	
	private int id;
	private String name;
	private String tel;
	private String email;
	
	public Person(int id, String name, String tel, String email) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public Person(String name, String tel, String email) {
		this.id = 0;
		this.name = name;
		this.tel = tel;
		this.email = email;
	}
	
	public Person () {}
	
	public int getId() {
		return id;
	}
	
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
	
	public void insertAgenda (Person p) {
		//TODO implement method that persists Person on database
	}
	
	public Person searchAgenda (String name) {
		Person p = new Person();
		
		//TODO implement search for name in database
		
		return p;
	}
	
	public void deleteAgenda (int id) {
		//TODO implement method that delets Person with ID = id from database
	}
	
}
