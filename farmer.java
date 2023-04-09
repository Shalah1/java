package SupplyChainManagementSystem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public abstract class farmer {

	Scanner scanner = new Scanner(System.in);

	String priceOFTS[] = { "\t\t\t30.0/kg, 45.0/kg, 50.0/kg," };

	String TS[] = { "\t\t\tpotato, tomato, onion" };

	String priceOFTHO[] = { "\t\t\t250.0/kg, 40.0/kg, 45.0/kg," };

	String THO[] = { "\t\t\tpotato, tomato, onion" };

	protected String nameString;
	protected Long phoneNum;
	
	LinkedList<String> list = new LinkedList<String>();
	String c = null;
	byte kg = 0;

	public void settings() {
		System.out.println("\t\t\tAvailable names :");
		list.add("Tony Stark");
		list.add("Thor");

		for (String string : list) {
			System.out.println("\t\t\t-> " + string);
		}
		System.out.println();
		System.out.println("\t\t\tFor tony stark type TS");
		System.out.println("\t\t\tFor Thor type THO");

		System.out.println();
		System.out.print("Enter your choice :");
		c = scanner.next();
		switch (c) {
		case "TS":
			TS();
			break;
		case "THO":
			THO();
			break;
		case "exit":
			System.out.println("\t\t\tExit....");
		default:
			System.out.println("\t\t\tInvalide key.Please try again.");

			break;
		}
	}

	public void TS() {
		System.out.println("\t\tI am offering you these products with these price :");
		System.out.println();
		for (String string : TS) {
			System.out.println(string);
		}
		for (String string : priceOFTS) {
			System.out.println(string);
		}
		System.out.println("\t------------------------------------------------------");
		int add = 0;
		char c = 0;
		System.out.println("\t\t\tfor potato type p");
		System.out.println("\t\t\tfor tomato type t");
		System.out.println("\t\t\tfor onion type o");
		System.out.println("\t\t\tto get out of this operation type e");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\n");

		try {
			do {
				System.out.print("Enter keys for products :");
				c = scanner.next().charAt(0);
				switch (c) {
				case 'p':
					System.out.println("\t\t\thow many kgs do you want ?\nAns:");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;//add=add+kg
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 30));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;
				case 't':
					System.out.println("\t\t\thow many kgs do you want ?");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 45));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;
				case 'o':
					System.out.println("\t\t\thow many kgs do you want ?");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 50));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;

				case 'e':
					System.out.println("\t\t\tExit....");
					break;
				default:
					System.out.println("\t\t\tInvalide key.Please try again.");
					break;

				}
			} while (c != 'e');
			return;

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void THO() {
		System.out.println("I am offering you these products with these price :");
		for (String string : THO) {
			System.out.println(string);
		}
		for (String string : priceOFTHO) {
			System.out.println(string);
		}
		System.out.println("\t------------------------------------------------------");

		int add = 0;
		char c = 0;
		System.out.println("\t\t\tfor potato type-> p");
		System.out.println("\t\t\tfor tomato type-> t");
		System.out.println("\t\t\tfor onion type-> o");
		System.out.println("\t\t\tto get out from his operation type-> e");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\n");
		try {
			do {
				System.out.print("Enter keys for products :");
				c = scanner.next().charAt(0);
				switch (c) {
				case 'p':
					System.out.println("\t\t\thow many kgs do you want ?\nAns:");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 30));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;

				case 't':
					System.out.println("\t\t\thow many kgs do you want ?");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 45));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;
				case 'o':
					System.out.println("\t\t\thow many kgs do you want ?");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
					}
					info();
					System.out.println("\t\t\tAnd price is :" + (add = add * 50));

					break;
				case 'e':
					System.out.println("\t\t\tExit....");
					break;
				default:
					System.out.println("\t\t\tInvalide key.Please try again.");
					break;

				}

			} while (c != 'e');
			return;
		} catch (Exception e) {
           e.printStackTrace();
		}

	}

	public void setName(String name) {
		this.nameString = name;
	}

	public String getName() {
		return nameString;
	}

	public void setPhone(Long pn) {
		this.phoneNum = pn;
	}

	public Long getPhone() {
		return phoneNum;
	}

	public void info() {
		System.out.print("\t\t\tYour name and phone number:\nAns:");
		String nameString = scanner.next();
		setName(nameString);
		long phonenum = scanner.nextLong();
		setPhone(phonenum);
		String location;
			System.out.println("\t\t\tAvalible locations :");
			String loc[] = { "Badda", "Gulshan", "Uttara", "Mirpur", "Banani" };
			for (String string : loc) {
				System.out.println("\t\t\t" + string);
			}
			try {
				System.out.print("\nEnter Locaiton :");
				location = scanner.next();
				byte count = 0;
				for (int i = 0; i < loc.length; i++) {
					if (location.equalsIgnoreCase(loc[i])) {
						count = 1;
					}
				}
				if (count == 1)
					System.out.println("\t\t\t\nAccepted!");
			} catch (Exception e) {
				System.out.println("\t\t\tWrite again...");
				e.printStackTrace();
			}

		
		System.out.println("\t\t\tWe have collected your information.");
		System.out.println("\t\t\t" + nameString + ", your order is ready");
		System.out.println();
		
		System.out.println("Select your Payment method :");
		System.out.println();
		System.out.println("\t\t\ttype-> bikas for using bikas");
		System.out.println("\t\t\ttype-> nogod for using nogod");
        
		System.out.println("Ans:");
		String ch = scanner.next();
		switch (ch) {
		case "bikas":
			System.out.println("Enter your bikas number :");
			Long bkashnum = scanner.nextLong();
			try {
				if (phoneNum.equals(bkashnum)) {
					System.out.println("Okay! Your numebr is selected.");
				}
				else {
					System.out.println("Try again...");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "nogod":
			System.out.println("Enter your bikas number :");
			Long nogodnum = scanner.nextLong();
			if (phoneNum.equals(nogodnum)) {
				System.out.println("Okay! Your numebr is selected.");
			} else if (!phoneNum.equals(nogodnum)) {
				System.out.println("Please try again!!");
			}
			break;
		default:
			break;
		}
	}

}
