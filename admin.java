package SupplyChainManagementSystem;

class admin extends farmer implements Ifarmer{

	
	static String price[] = {"\t\t\t20.0/kg, 35.0/kg, 40.0/kg," };
	static String products[] = {"\t\t\tpotato, tomato, onion" };

	public admin() {
		System.out.println(/* default */);
	}

	shop s;

	admin(shop o) {
		this.s = o;
	}

	// setter & getter()
	public shop getS() {
		return s;
	}

	public void setS(shop s) {
		this.s = s;
	}

	 @Override
	public void settings() {
		// TODO Auto-generated method stub
		super.settings();
	}
	

	@Override
	public void options() {
		int choice = 0;
		System.out.println("\t 1 for showing all things ");		
		System.out.println("\t 0 to exit");
		do {
			// choice;
			System.out.print("Ans:");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				settings();
				break;
			case 0:
				System.out.println("\nExit.....");
				break;
			default:
				System.out.println("invalide key");
				break;
			}
		} while (choice != 0);
		return;
	}

	public void ShpopOptions() {
		int choice = 0;
		char c=0;
		System.out.println("\t\t\t 1 to complete all operations");
		
		System.out.println("\t\t\t 0 to exit");
		try {
		do {
			// choice;
			System.out.print("\nAns : ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				showingShopiteams();
				showShopName();
			
				System.out.println("\t\t\tWhat do you want to buy from us ?");
				System.out.println();
				System.out.println("\t\t\ttype-> n for normal products ");
				System.out.println("\t\t\ttype-> h for home made food ");
				System.out.println("\t\t\ttype-> e to exit.");
				System.out.print("\nAns : ");
				c = scanner.next().charAt(0);
				switch (c) {
				case 'n':
					s.normalFoods();
					break;
				case 'h':
					s.homeMadeFoods();
					break;
				case 'e':
					System.out.println("Exit");
				default:
					System.out.println("Invalide key.Please Try again.");
					break;
				}
				
				break;

			case 0:
				System.out.println("\nExit.....");
				break;
			default:
				System.out.println("invalide key");
				break;
			}
		} while (choice != 0);
		return;
		}
		catch (Exception e) {
			System.out.println(e+"Try again......");
			e.printStackTrace();
		}
	}

	@Override
	public void showingShopiteams() {
		
		s.locations();
		
	}

	public void showShopName() {
		s.shopNames();

	}
	
}
