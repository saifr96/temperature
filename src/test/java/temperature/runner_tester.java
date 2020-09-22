package temperature;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class runner_tester {
	
	   private static Temperature temp;

	    @BeforeClass
	    public static void setup() {
	        temp = new Temperature();
	    }	
	
	
	@Test
	public void kelvinToC() {
	
		assertEquals(0,temp.convertKelvinToCelsius(273),0);
	}
	 @Test
	    public void shouldConvertCelsiusToFahrenheit() {
	        assertEquals(32,temp.convertCelsiusToFahrenheit(0), 0);
	           
	}
	
	 @Test
		public void IsTrueTrue() {
			boolean IsTrueTrue = true;
			 assertTrue("Expected: Temp Set to True",IsTrueTrue);
			
		}
		
		
		
		
		
}
