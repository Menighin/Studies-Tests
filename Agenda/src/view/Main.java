package view;

import java.util.Scanner;
import model.Person;

public class Main {
	
	
	public static void main (String args[]) {
		int op = 0;
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
					
					//TODO call controller method to insert
					break;
				case 2:
					sc.nextLine();
					System.out.println("Name to search: ");
					name = sc.nextLine();
					
					//TODO call controller method that search for name;
					break;
				case 3:
					//TODO call controller method that returns all Person;
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
