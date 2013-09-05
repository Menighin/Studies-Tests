package view;

import java.util.ArrayList;
import java.util.Scanner;
import model.Person;
import controller.PersonController;

public class Main {
	
	
	public static void main (String args[]) {
		int op = 0;
		PersonController pc = new PersonController();
		Person p;
		Scanner sc = new Scanner(System.in);
		String name;
		ArrayList<Person> result = new ArrayList<Person>();
		
		try {
			pc.Connect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		do {
			printMenu();
			System.out.print("Your option: ");
			op = sc.nextInt();
			
			switch (op) {
				case 1:
					p = new Person();
					sc.nextLine();
					System.out.println("Insert person data.");
					System.out.print("Name: ");
					p.setName(sc.nextLine());
					System.out.print("Tel: ");
					p.setTel(sc.nextLine());
					System.out.print("Email: ");
					p.setEmail(sc.nextLine());
					
					try {
						pc.insertAgenda(p);
					} catch (Exception e) {
						System.out.println(e.getMessage());
						break;
					}
					
					System.out.println("Person inserted successfully!");
					
					break;
				case 2:
					sc.nextLine();
					System.out.print("Name to search: ");
					name = sc.nextLine();
					
					try {
						result = pc.searchAgenda(name);
					} catch (Exception e) {
						result = new ArrayList<Person>();
						System.out.println(e.getMessage());
					}
					
					for (Person temp : result) {
						System.out.println("##########################\n");
						System.out.println(temp.toString());
						System.out.println();
					}
					
					if (result.isEmpty()) {
						System.out.println("##########################");
						System.out.println("There is nobody called " + name + " on your agenda!");
						System.out.println();
					}
					
					break;
				case 3:
						
					try {
						result = pc.listAll();
					} catch (Exception e) {
						result = new ArrayList<Person>();
						System.out.println(e.getMessage());
					}
					
					for (Person temp : result) {
						System.out.println("##########################\n");
						System.out.println(temp.toString());
						System.out.println();
					}
					
					if (result.isEmpty()) {
						System.out.println("##########################");
						System.out.println("Your agenda is empty!");
						System.out.println();
					}
					
					break;
			}
			
		} while (op != 4);
		
		sc.close();
		
		try {
			pc.Disconnect();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void printMenu() {
		System.out.println("------------- MENU -------------");
		System.out.println("(1) Insert person");
		System.out.println("(2) Search person");
		System.out.println("(3) List all agenda");
		System.out.println("(4) Exit");
		System.out.println();
	}
	
}