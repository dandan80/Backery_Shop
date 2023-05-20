public class Recipe {
	private String names;
	private String instruction;
	private float flour;
	private float yeast;
	private float sugar;
	private float eggs;
	private float butter;
	private int quantity;

	/**
	 * This is the instruction array contains instructions for each bread
	 */
	public String[] cookMethod = { "just dove", "add water", "add yeast", "put in oven", "cook an hour", "375 degrees",
			"pick out from oven" };

	/**
	 * This is a no-parameter constructor
	 */
	public Recipe() {
	}

	/**
	 * This is a constructor with parameter
	 * 
	 * @param quantity    the amount of the bread
	 * @param name        the name of the bread
	 * @param flour       the amount of flour that to make one bread use
	 * @param yeast       the amount of yeast that to make one bread use
	 * @param sugar       the amount of sugar that to make one bread use
	 * @param eggs        the amount of eggs that to make one bread use
	 * @param butter      the amount of butter that to make one bread use
	 * @param instruction the instruction for the bread
	 */
	public Recipe(int quantity, String name, float flour, float yeast, float sugar, float eggs, float butter,
			String instruction) {
	}

	/**
	 * To get the instruction of the bread and return it
	 * 
	 * @return the instruction
	 */
	public String getInstruction() {
		return instruction;
	}

	/**
	 * To set the instruction of the bread
	 * 
	 * @param instruction the instruction of bread
	 */
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	/**
	 * To get name of bread and return it
	 * 
	 * @return the name of bread
	 */
	public String getNames() {
		return names;
	}

	/**
	 * To set the name of bread
	 * 
	 * @param names the name of bread to set
	 */
	public void setNames(String names) {
		this.names = names;
	}

	/**
	 * To get the quantity of the bread and return it
	 * 
	 * @return the quantity of bread
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * To set the amount of quantity of bread
	 * 
	 * @param quantity the quantity of bread to set
	 */
	public void setQuantity(int q) {
	
		if((quantity + q)>0){
		quantity += q;
	}else {
		quantity = 0;
	}
	}

	/**
	 * To get the amount of the flour that bread user and return it
	 * 
	 * @return the amount of flour
	 */
	public float getFlour() {
		return flour;
	}

	/**
	 * To set the amount of flour
	 * 
	 * @param flour the amount of flour to set
	 */
	public void setFlour(float flour) {
		this.flour = flour;
	}

	/**
	 * To get the amount of the yeast that bread user and return it
	 * 
	 * @return the amount of yeast for bread
	 */
	public float getYeast() {
		return yeast;
	}

	/**
	 * To set the amount of yeast
	 * 
	 * @param yeast the amount of yeast to set
	 */
	public void setYeast(float yeast) {
		this.yeast = yeast;
	}

	/**
	 * To get the amount of sugar that bread user and return it
	 * 
	 * @return the amount of sugar for bread
	 */
	public float getSugar() {
		return sugar;
	}

	/**
	 * To set the amount of sugar
	 * 
	 * @param sugar the amount of sugar to set
	 */
	public void setSugar(float sugar) {
		this.sugar = sugar;
	}

	/**
	 * To get the amount of eggs that bread user and return it
	 * 
	 * @return the amount of eggs for bread
	 */
	public float getEggs() {
		return eggs;
	}

	/**
	 * To set the amount of eggs
	 * 
	 * @param eggs the amount of eggs to set
	 */
	public void setEggs(float eggs) {
		this.eggs = eggs;
	}

	/**
	 * To get the amount of butter that bread user and return it
	 * 
	 * @return the amount of butter for bread
	 */
	public float getButter() {
		return butter;
	}

	/**
	 * To set the amount of butter
	 * 
	 * @param butter the amount of butter to set
	 */
	public void setButter(float butter) {
		this.butter = butter;
	}

}
