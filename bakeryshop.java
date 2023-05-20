public class BakeryShop {
	/**
	 * To create an object of class RecipeManager.
	 */
	RecipeManager recipeMgr = new RecipeManager();// To invoke the non-parameter constructor

	/**
	 * This method is the application's entry point.
	 * 
	 * @param args an array of command-line arguments for the application
	 */
	public static void main(String[] args) {// the starting point of this program
		BakeryShop bakeryshop = new BakeryShop();// To break out of the static paradigm.
	}

	/**
	 * The constructor for class Lab5. This contains all the main functions in this
	 * program, like display and reprint bread menu, create shopping list, print the
	 * shopping list, and exit this program.
	 */
	public Lab5() {
		int choice1;
		int menuCho = 10;
		int bQuantity = 0;
		int breadCho = 0;

		System.out.println("Welcome to Dandan C's recipe manager.");
		// To create bread menu in an ArrayList.
		recipeMgr.breadMenuCreate();
		// This do-while loop controls to do different methods according the users
		// choice
		// also, it can exit this program if the users choose it.
		do {
			boolean end1 = false;
			// this while loop controls the users should input the int type and the range
			// is from 0 to 4. If the input's type or range is wrong, it will print out
			// tips and ask users to input a new one.
			while (!end1) {
				welcomeMenu();
				// This try-catch controls if the user input another type, it will print out
				// an exception message.
				try {
					Scanner keyboard = new Scanner(System.in);
					choice1 = keyboard.nextInt();
					keyboard.nextLine();
					if (choice1 >= 0 && choice1 < 5) {
						menuCho = choice1;
						end1 = true;
					} else {
						System.out.println("Valid input are digits from 0 to 4.");
					}
				} catch (InputMismatchException e) {
					System.out.println("Please only type digits");
				}
			}
			end1 = false;

			switch (menuCho) {
			case 1:
				// display the recipes menu
				System.out.println("Available Recipes: ");
				recipeMgr.displayBread();
				System.out.println();
				break;

			case 2:
				// to create the shopping list
				boolean exit = false;
				
				// this do-while loop controls the users input the right type and numbers
				// are in range.
				do {
					boolean end2 = false;
					while (!end2) {
						int choice2;
						// this try-catch and if-else to control the users input the right bread type
						// number
						try {
							Scanner input = new Scanner(System.in);
							System.out.println("Which bread would you like?");
							choice2 = input.nextInt();
							input.nextLine();

							if (choice2 > 0 && choice2 < 8) {
								breadCho = choice2;
								end2 = true;
							} else {
								System.out.println("Valid input are digits from 1 to 7.");
							}
						} catch (InputMismatchException e) {
							System.out.println("Please only type digits.");
						}
					}
					boolean end5 = false;
					// this while controls user to input the right type
					while (!end5) {
						try {
							Scanner choose3 = new Scanner(System.in);
							System.out.println("How much of this bread would you like?");
							bQuantity = choose3.nextInt();
							choose3.nextLine();
							end5 = true;
						} catch (InputMismatchException e) {
							System.out.println("Please only type digits.");
							end5 = false;
						}
					}

					boolean end3 = false;
					// According the user's input to invoke the breadOrder method
					recipeMgr.breadOrder(breadCho, bQuantity);

					// this while loop controls users want to add more than one type
					// of bread, if they input 9, they can continue to add more bread
					// in the shopping list; if they input another integer, they will
					// exit this loop to the main menu; if they input another type, the
					// exception will print out a message.
					while (!end3) {
						// this try-catch and if-else control the user input the right type
						// and the number should in the range.
						try {
							System.out.println(
									"Do you want more bread, if you want more press 9, if you chose other integers, it will be exit the choice menu.");
							Scanner keyboard = new Scanner(System.in);
							int choice4 = keyboard.nextInt();
							if (choice4 == 9) {
								end3 = true;
								end2 = false;
								exit = false;
							} else {
								end3 = true;
								exit = true;
							}
						} catch (InputMismatchException e) {
							System.out.println("Please only type digits.");
						}
					}
				} while (!exit);
				break;
			// this case will print out the shopping list. It contains two different
			// unit. The shopping list contains each type of bread and their numbers,
			// the recipe of the total, and the instruction for each bread.
			case 3:
				System.out.println();
				recipeMgr.recipeAll();
				boolean end4 = false;
				while (!end4) {
					System.out.println("Please input your choice of the shopList: ");
					System.out.println("0. unit: grams.");
					System.out.println("1. imperial units.");
					// this try-catch and if-else control users input the right type
					// and the right range of number to choose.
					try {
						Scanner sc = new Scanner(System.in);
						int choice5 = sc.nextInt();
						if (choice5 > 1) {
							System.out.println("Your input choice should be 0 or 1.");
							end4 = false;
						} else {
							recipeMgr.shopList(choice5);
							end4 = true;
						}

					} catch (InputMismatchException e) {
						System.out.println("Please only type digits.");
					}
				}
				end4 = false;
				break;
			// This case will exit the program and print out a message
			case 4:
				System.out.println("This bread recipe manager by Dandan Cao.");
				break;
			// This case will reprint the main menu
			case 0:
				break;
			}
		} while (menuCho != 4);
	}

	/**
	 * This method prints the welcome menu.
	 */
	public void welcomeMenu() {// print out the welcome menu
		System.out.println("Please select one of the following options: ");
		System.out.println("1. Show available recipes.");
		System.out.println("2. Create shopping List");
		System.out.println("3. Print Shopping List");
		System.out.println("4. Quit Program.");
		System.out.println("0. to reprint this menu.");
		System.out.println("Please enter your choice: ");
	}

}
