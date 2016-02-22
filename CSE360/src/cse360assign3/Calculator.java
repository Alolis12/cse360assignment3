/** This class replicates the functions of a calculator.
 * 
 *  @author Cory Campbell
 *  		Pin 208 
 *   		Assignment 3*/
package cse360assign3;

public class Calculator {

	private int total;
	private String history;
	
	/** This method is the constructor for the Calculator class. */
	public Calculator () {
		total = 0;  
		history = "";
	}
	
	/** This method gets the total.	 * 
	 * @return total is the current value of the calculated total*/
	public int getTotal () {
		return total;
	}
	
	/** This method performs addition.
	 * @param value is added to the total*/
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/** This method performs subtraction.
	 * @param value is subtracted from the total*/
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/** This method performs multiplication.
	 * @param value is multiplied by the total*/
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/** This method performs division. 
	 * @param value is divided into the total*/
	public void divide (int value) {
		if (value == 0){
			total = 0;
			history = history + " / " + value;
		}
		else{
			total = total / value;
			history = history + " / " + value;
		}
	}
	
	/** This method returns the history of the previous calculations. 
	 * @return Returns is a string containing the history of calculations performed*/
	public String getHistory () {
		return "0" + history;
	}
}