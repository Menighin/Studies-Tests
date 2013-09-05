package controller;

import java.util.ArrayList;
import model.Person;

public class PersonController {
	
	public void Connect() throws Exception {
		Person.Connect();
	}
	
	public void insertAgenda (Person p) throws Exception {
		Person.insertAgenda(p);
	}
	
	public ArrayList<Person> searchAgenda (String name) throws Exception {
		return Person.searchAgenda(name);
	}
	
	public ArrayList<Person> listAll() throws Exception {
		return Person.returnAgenda();
	}
	
	public void Disconnect() throws Exception {
		Person.Disconnect();
	}
}
