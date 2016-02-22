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
		
		assertEquals(0,calc.getTotal());
		
	}
	
	/** This test is for the add method.*/
	@Test
	public void testAdd(){
		
		calc.add(5);
		
		assertEquals(5,calc.getTotal());
	}
	
	/** This test is for the subtract method.*/
	@Test
	public void testSubtract(){
		
		calc.subtract(5);
		
		assertEquals(-5,calc.getTotal());
	}
	
	/** This test is for the multiply method.*/
	@Test
	public void testMultiply(){

		calc.add(1);
		calc.multiply(5);
		
		assertEquals(5,calc.getTotal());
	}
	
	/** This test is for the divide method dividing by zero.*/
	@Test
	public void testDivideByZero(){

		assertEquals(0,calc.getTotal());
	}
	
	/** This test is for the divide method.*/
	@Test
	public void testDivide(){
		
		calc.add(5);
		calc.divide(5);
		
		assertEquals(1,calc.getTotal());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryEmpty(){
		
		calc.getHistory();
		
		assertEquals("0",calc.getHistory());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryAdd(){
		
		calc.add(5);
		calc.getHistory();
		
		assertEquals("0 + 5",calc.getHistory());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistorySubtract(){
		
		calc.subtract(5);
		calc.getHistory();
		
		assertEquals("0 - 5",calc.getHistory());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryMultiply(){
		
		calc.multiply(5);
		calc.getHistory();
		
		assertEquals("0 * 5",calc.getHistory());
	}

	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryDivide(){
		
		calc.divide(5);
		calc.getHistory();
		
		assertEquals("0 / 5",calc.getHistory());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryDivideByZero(){
		
		calc.divide(0);
		calc.getHistory();
		
		assertEquals("0 / 0",calc.getHistory());
	}
	
	/** This test is for the getHistory method.*/
	@Test
	public void testGetHistoryUsingAllOperations(){
		
		calc.add(5);
		calc.subtract(2);
		calc.multiply(2);
		calc.divide(3);
		calc.getHistory();
		
		assertEquals("0 + 5 - 2 * 2 / 3",calc.getHistory());
	}
}
