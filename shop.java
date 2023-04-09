package SupplyChainManagementSystem;

import java.util.Scanner;

public class shop implements Ishop {

	String location, tempShop;
	private String nameString;
	private Long pn;

	static String price[] = { "\t\t\t20.0/kg, 35.0/kg, 40.0/kg," };
	static String products[] = { "\t\t\tpotato, tomato, onion" };

	static String price2[] = { "\t\t\t200, 500, 150," };
	static String homeMadeFoods[] = { "\t\t\tburger, pizza, chowmein" };

	static byte kg = 0, quantity = 0;

	Scanner scanner = new Scanner(System.in);

	public void locations() {
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

	}

	public void shopNames() {
		System.out.println("\t\t\tAvalible locations :");
		String names[] = { "XYZ101", "ABC102", "PQR103", "UVW104", "GFG105" };
		for (String string : names) {
			System.out.println("\t\t\t" + string);
		}

		System.out.print("\nEnter your shop name :");
		tempShop = scanner.next();
		byte count = 0;
		try {
			for (int i = 0; i < names.length; i++) {
				if (tempShop.equalsIgnoreCase(names[i])) {
					count = 1;
				}

			}
			if (count == 1) {
				System.out.println("\t\t\t\nAccepted!");
			}
		} catch (Exception e) {
			System.out.println("Write again..");
			e.printStackTrace();
		}

	}

	@Override
	public void normalFoods() {
		System.out.println("\t\t\tWe are selling these products :");
		System.out.println();
		for (String string : products) {
			System.out.println(string);
		}
		for (String string : price) {
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

		System.out.println("\n");
		try {
			do {
				System.out.print("Enter keys for products :");
				System.out.println();
				c = scanner.next().charAt(0);
				switch (c) {
				case 'p':
					System.out.println("\t\t\thow many kgs do you want ?\nAns:");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 20));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}

					break;
				case 't':
					System.out.println("\t\t\thow many kgs do you want ?\nAns:");
					kg = scanner.nextByte();
					if (kg > 0) {
						add += kg;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 35));
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
						System.out.println("\t\t\tAnd price is :" + (add = add * 40));
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

			System.out.println("\t\t\tTry again.");

			e.printStackTrace();
		}
	}

	@Override
	public void homeMadeFoods() {
		System.out.println("\t\t\tWe are offering you these products :");
		for (String string : homeMadeFoods) {
			System.out.println(string);
		}
		for (String string : price2) {
			System.out.println(string);
		}
		int add = 0;
		char c = 0;
		System.out.println("\t\t\tfor burger type b");
		System.out.println("\t\t\tfor pizza type p");
		System.out.println("\t\t\tfor chowmein type c");
		System.out.println("\t\t\tto get out from his operation type e");
		System.out.println("\t------------------------------------------------------");
		System.out.println("\n");

		try {
			do {
				System.out.print("Enter keys for products :");
				c = scanner.next().charAt(0);
				switch (c) {
				case 'b':
					System.out.println("\t\t\thow many burger do you want ?");
					quantity = scanner.nextByte();
					if (quantity > 0) {
						add += quantity;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = (add * 200)));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}

					break;
				case 'p':
					System.out.println("how many pizza do you want ?");
					quantity = scanner.nextByte();
					if (quantity > 0) {
						add += quantity;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = (add * 500)));
					} else {
						System.out.println("\t\t\tNot possible!!!!!!");
					}
					break;
				case 'c':
					System.out.println("how many chawmein do you want ?");
					quantity = scanner.nextByte();
					if (quantity > 0) {
						add += quantity;
						info();
						System.out.println("\t\t\tAnd price is :" + (add = add * 150));
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
			System.out.println("\t\t\tTRY Again.....");
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
		this.pn = pn;
	}

	public Long getPhone() {
		return pn;
	}

	public void info() {
		System.out.print("\t\t\tYour name and phone number:\nAns:");
		String nameString = scanner.next();
		setName(nameString);
		long phonenum = scanner.nextLong();
		setPhone(phonenum);
		System.out.println("\t\t\tWe have collected your information.");
		System.out.println("\t\t\t" + nameString + ", your order is read.");
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
				if (pn.equals(bkashnum)) {
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
			if (pn.equals(nogodnum)) {
				System.out.println("Okay! Your numebr is selected.");
			} else if (!pn.equals(nogodnum)) {
				System.out.println("Please try again!!");
			}
			break;
		default:
			break;
		}
	}

}
