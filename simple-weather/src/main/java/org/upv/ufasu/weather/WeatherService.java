package org.upv.ufasu.weather;

import java.io.InputStream;

public class WeatherService {

    public WeatherService() {}

    public String retrieveForecast( String zip ) throws Exception {
	// Retrieve Data
	InputStream dataIn = new YahooRetriever().retrieve( zip );
	
	// Parse Data
	Weather weather = new YahooParser().parse( dataIn );
	
	TemperatureConversor tc = new TemperatureConversor();
	String celsius = tc.fahrenheit2Celsius(weather.getTemp());
	weather.setTemp(celsius);
	
	// Format (Print) Data
	return new WeatherFormatter().format( weather );
    }	
}
