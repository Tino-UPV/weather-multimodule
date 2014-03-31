package org.upv.ufasu.weather.test;

import org.upv.ufasu.weather.TemperatureConversor;
import junit.framework.TestCase;

public class TemperatureConversorTest extends TestCase {
	
	public void testConversor() throws Exception {
		
		TemperatureConversor tc = new TemperatureConversor();
		assertEquals( "10", tc.fahrenheit2Celsius("50") );
		
	}

}
