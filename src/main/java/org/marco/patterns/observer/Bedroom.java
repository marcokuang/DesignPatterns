package org.marco.patterns.observer;

public class Bedroom implements Observer {

	private int currentTemperature = 0;
	private String currentWeather = "N/A";
	
	public int getCurrentTemperature() {
		return currentTemperature;
	}

	public String getCurrentWeather() {
		return currentWeather;
	}

	public void update(int temperature) {
		// TODO Auto-generated method stub
		this.currentTemperature = temperature;
		printWeather();
		
	}

	public void update(String weather) {
		// TODO Auto-generated method stub
		this.currentWeather = weather;
		printWeather();
	}
	
	private void printWeather() {
		System.out.println("From Bedroom-- Weather Temperature now is: " + this.currentTemperature + 
				" degrees, and the weather is " + this.currentWeather);
	}
}
