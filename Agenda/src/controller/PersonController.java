package controller;

import java.util.ArrayList;
import model.Person;

public class PersonController {
	
	public void insertAgenda (Person p) {
		Person.insertAgenda(p);
	}
	
	public ArrayList<Person> searchAgenda (String name) {
		return Person.searchAgenda(name);
	}
	
	public ArrayList<Person> listAll() {
		return Person.returnAgenda();
	}
}
