/** This class tests the methods within the Calculator class.
 *  @author Cory Campbell
 *  		Pin 208
 *  		Assignment 3 */

package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.After;

public class CalculatorTest{

	private Calculator calc;
		
	@Before
	public void setUp(){
		calc = new Calculator();
	}
			
	/** This test is for the constructor of the Calculator class.*/
	@Test
	public void testCalculator(){
		assertNotNull(calc);
	}
	
	/** This test is for the getTotal method*/
	@Test
	public void testGetTotal(){
		fail("Not yet implemented");
	}
	
	/** This test is for the add method.*/
	@Test
	public void testAdd(){
		fail("Not yet implemented");
	}
	
	/** This test is for the subtract method.*/
	@Test
	public void testSubtract(){
		fail("Not yet implemented");
	}
	
	/** This test is for the multiply method.*/
	@Test
	public void testMultiply(){
		fail("Not yet implemented");
	}
	
	/** This test is for the divide method.*/
	@Test
	public void testDivide(){
		fail("Not yet implemented");
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistory(){
		fail("Not yet implemented");
	}
	
	

}
