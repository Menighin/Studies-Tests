package view;

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
					
					pc.insertAgenda(p);
					break;
				case 2:
					sc.nextLine();
					System.out.println("Name to search: ");
					name = sc.nextLine();
					
					for (Person temp : pc.searchAgenda(name)) {
						System.out.println(temp.toString());
						System.out.println("##########################");
					}
					break;
				case 3:
					for (Person temp : pc.listAll()) {
						System.out.println(temp.toString());
						System.out.println("##########################");
					}
					break;
			}
			
		} while (op != 4);
		
		sc.close();
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
