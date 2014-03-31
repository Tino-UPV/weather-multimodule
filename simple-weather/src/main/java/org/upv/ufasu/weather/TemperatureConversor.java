package org.upv.ufasu.weather;

public class TemperatureConversor {
	
	public void TemperatureConversor(){
		
	}
	
	public String fahrenheit2Celsius(String str) {
		
		int f = Integer.parseInt(str);
		int c = (int) Math.abs((f-32)/1.8);
		
		return Integer.toString(c);
	}

}
