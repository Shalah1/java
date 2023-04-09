package SupplyChainManagementSystem;

import java.util.Scanner;

public class system_main {

	static Scanner scanner = new Scanner(System.in);
	static admin obj = new admin();
	// static Farmer obj2 = new Farmer();
	static shop obj3 = new shop();
	static admin oAdmin = new admin(obj3);

	public static void main(String[] args) {

		mainDisplay();
	}

	public static void display2ForFarmer() {

		obj.options();
	}

	public static void displayForShop() {

		oAdmin.ShpopOptions();
	}

	public static void mainDisplay() {
		int choice = 0;
		System.out.println("\t\t\tWelcome to our E-Store");
		System.out.println("\t------------------------------------------------------");
		System.out.print("\n");
		System.out.println("\tFrom us, you can get farmers details to order products "
				+ " directly from farmers \t\n        and shops details to order products directly from shop");
		System.out.print("\n");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\t\t\tpress 1 for farmer ");
		System.out.println("\t\t\tpress 2 for shop ");
		System.out.println("\t\t\tpress 0 for exit");

		do {

			System.out.print("\nAns : ");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				display2ForFarmer();
				break;
			case 2:
				displayForShop();
				break;
			case 0:
				System.out.println("\nExit.....");
				break;
			default:
				System.out.println("invalide key");
				break;
			}
		} while (choice != 0);
		System.out.println("\t------------------------------------------------------");
		System.out.println("\t\t\tThank you for using service.");
		return;
	}
}
