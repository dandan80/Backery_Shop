public class RecipeManager extends RecipeTemplate {

	private ArrayList<Recipe> breadRecipeMenu = new ArrayList<>();
	private float[] recipeTotal = new float[5];

	/**
	 * This is a no-parameter constructor
	 */
	public RecipeManager() {
	}

	/**
	 * This method creates the object of bread and add them in an arrayList
	 * 
	 * @return The ArrayList contains the objects of bread and the type is recipe
	 */
	public ArrayList<Recipe> breadMenuCreate() {// create and initial the ArrayList
		for (int i = 0; i < 7; i++) {
			Recipe r = new Recipe();
			r.setQuantity(0);
			r.setNames(names[i]);
			r.setFlour(flour[i]);
			r.setYeast(yeast[i]);
			r.setSugar(sugar[i]);
			r.setButter(butter[i]);
			r.setEggs(eggs[i]);
			r.setInstruction(r.cookMethod[i]);
			breadRecipeMenu.add(r);
		}
		return breadRecipeMenu;
	}

	/**
	 * This method display the bread menu
	 */
	public void displayBread() {// To display the bread menu
		for (int i = 1; i < 8; i++) {
			System.out.println(i + "." + breadRecipeMenu.get(i - 1).getNames());
		}
	}

	/**
	 * This method create the bread order
	 * 
	 * @param breadChoice   the type of the bread
	 * @param breadQuantity the number of the bread
	 */

	public void breadOrder(int breadChoice, int breadQuantity) {// To create the bread order
		// this for-loop to set the quantity of the bread order
		for (int i = 0; i < breadRecipeMenu.size(); i++) {
			if (breadChoice - 1 == i) {
				breadRecipeMenu.get(i).setQuantity(breadQuantity);
			}
		}
		// this for loop to print proper singular/plural messages of bread
		for (int i = 0; i < breadRecipeMenu.size(); i++) {
			if (breadRecipeMenu.get(i).getQuantity() == 1) {
				System.out.println(
						breadRecipeMenu.get(i).getQuantity() + " " + breadRecipeMenu.get(i).getNames() + " loaf.");
			}
			if (breadRecipeMenu.get(i).getQuantity() > 1) {
				System.out.println(
						breadRecipeMenu.get(i).getQuantity() + " " + breadRecipeMenu.get(i).getNames() + " loaves.");
			}
		}

	}

	/**
	 * The purpose is to calculate the total recipe for each ingredients and add
	 * this in an array.
	 */
	public void recipeAll() {// To create the total ingredients
		int quantityT = 0;
		float flourT = 0;
		float yeastT = 0;
		float sugarT = 0;
		float eggsT = 0;
		float butterT = 0;
		// this for-loop to get the quantity of the bread
		
	/*	for (int i = 0; i < breadRecipeMenu.size(); i++) {
			if (breadRecipeMenu.get(i).getQuantity() < 0) {
				breadRecipeMenu.get(i).setQuantity(0);
			}
		}
		*/
		// this for-loop to calculate the amount of each ingredients and add them in an
		// array
		for (int i = 0; i < breadRecipeMenu.size(); i++) {
			flourT += breadRecipeMenu.get(i).getQuantity() * breadRecipeMenu.get(i).getFlour();
			recipeTotal[0] = flourT;
			yeastT += breadRecipeMenu.get(i).getQuantity() * breadRecipeMenu.get(i).getYeast();
			recipeTotal[1] = yeastT;
			sugarT += breadRecipeMenu.get(i).getQuantity() * breadRecipeMenu.get(i).getSugar();
			recipeTotal[2] = sugarT;
			eggsT += breadRecipeMenu.get(i).getQuantity() * breadRecipeMenu.get(i).getEggs();
			recipeTotal[3] = eggsT;
			butterT += breadRecipeMenu.get(i).getQuantity() * breadRecipeMenu.get(i).getButter();
			recipeTotal[4] = butterT;
		}
	}

	/**
	 * The purpose is to create the shopping list and print out
	 * 
	 * @param choice the user choose the type of the shopping list with different
	 *               unit
	 */
	public void shopList(int choice) {// print the shopping list
		// this for-loop is when users choose standard unit, it can print out the bread
		// order,
		// the instruction of this bread, the amount of each ingredients with standard
		// unit.
		for (int i = 0; i < breadRecipeMenu.size(); i++) {
			// this if controls the singular message when the quantity is only 1
			if (breadRecipeMenu.get(i).getQuantity() == 1) {
				System.out.println(
						breadRecipeMenu.get(i).getQuantity() + " " + breadRecipeMenu.get(i).getNames() + " loaf.");
				System.out.println("The instruction of " + breadRecipeMenu.get(i).getNames() + " is: "
						+ breadRecipeMenu.get(i).getInstruction());
				System.out.println();
			}
			// this if controls the plural message when the quantity is more than 1
			if (breadRecipeMenu.get(i).getQuantity() > 1) {
				System.out.println(
						breadRecipeMenu.get(i).getQuantity() + " " + breadRecipeMenu.get(i).getNames() + " loaves.");

				System.out.println("The instruction of " + breadRecipeMenu.get(i).getNames() + " is: "
						+ breadRecipeMenu.get(i).getInstruction());
				System.out.println();
			}
		}
		System.out.println();
		// this if controls to print the ingredients menu with the standard unit.
		if (choice == 0) {
			System.out.println("You will need a total of: \n");

			if (recipeTotal[0] > 0) {
				System.out.println((int) recipeTotal[0] + " grams of flour.");
			}
			if (recipeTotal[1] > 0) {
				System.out.println((int) recipeTotal[1] + " grams of yeast.");
			}
			if (recipeTotal[2] > 0) {
				System.out.println((int) recipeTotal[2] + " grams of sugar.");
			}
			if (recipeTotal[3] == 1) {
				System.out.println((int) recipeTotal[3] + " egg.");
			}
			if (recipeTotal[3] > 1) {
				System.out.println((int) recipeTotal[3] + " eggs.");
			}
			if (recipeTotal[4] > 0) {
				System.out.println((int) recipeTotal[4] + " grams of butter.");
			}
			System.out.println();
		}
		// this if controls the ingredients units are imperial units.
		if (choice == 1) {
			System.out.println("You will need a total of: \n");
			if (recipeTotal[0] > 0) {
				System.out.printf("%.2f cups of flour.\n", (recipeTotal[0] / 125));
			}
			if (recipeTotal[1] > 0) {
				System.out.printf("%.2f teaspoons of yeast.\n", (recipeTotal[1] / 3.1));
			}
			if (recipeTotal[2] > 0) {
				System.out.printf("%.2f tablespoons of sugar.\n", (recipeTotal[2] / 12.7));
			}
			if (recipeTotal[3] == 1) {
				System.out.printf((int) recipeTotal[3] + " egg.\n");
			}
			if (recipeTotal[3] > 1) {
				System.out.printf((int) recipeTotal[3] + " eggs.\n");
			}
			if (recipeTotal[4] > 0) {
				System.out.printf("%.2f pounds of butter.", (recipeTotal[4] / 453.6));
			}
			System.out.println();
		}
		System.out.println();
	}

}
