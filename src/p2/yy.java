package p2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class yy {

	@Test
	public void testSum_BothNumbersArePositive_ShouldReturnPositiveNumber() {  
		// Arrange  
		int a = 10;     int b = 20;  
		Calculator calc = new Calculator(); 
	   // Act    
	     int result = calc.sum(a, b); 
	   // Assert   
	   assertTrue(result > 0); 
	    } 
	 
	
}
