package cse360assign3;
      
/** 
 * Name: Brando Flores
 * Class ID: 70641
 * This program sums and subtracts integers.
 * It also keeps a history of any additions or subtractions made.
 * It is used as an example of how to use version control.
 * 
 * @author Brando Flores
 * @version 1.0
 */
public class AddingMachine {

	protected int total;
	protected String history;
	
	/**
	 * Constructor used to create AddingMachine objects.
	 * Instantiated with total being 0
	 * and history being 0.
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Get the current total of the AddingMachine object.
	 * @return the total.
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Add an integer value to the current total.
	 * Update the history of the changes made to the total value.
	 * @param the integer value to be added to the total.
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;	
	}
	
	/**
	 * Subtract an integer value form the current total.
	 * Update the history of the changes made to the total value.
	 * @param the integer value to be subtracted from the total.
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	/**
	 * toString method returns the history of additions 
	 * and/or subtractions made to the total.
	 * @return the history of changes made.
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Sets total and history back to default values.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
