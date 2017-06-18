package org.marco.patterns.observer;

import java.awt.List;
import java.util.Iterator;
import java.util.LinkedList;

public class WeatherReport implements Subject{
	private LinkedList<Observer> observers = new LinkedList<Observer>();

	private int temperature;
	private String weatherCondition;
	public void registerObservers(Observer obs) {
		// TODO Auto-generated method stub
		observers.add(obs);
	}

	public void removeObservers(Observer obs) {
		// TODO Auto-generated method stub
		observers.remove(obs);
		
	}

	public void notifyObservers() {
		// TODO Auto-generated method stub
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer current = iterator.next();
			current.update(temperature);
			current.update(weatherCondition);
		}
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getWeatherCondition() {
		return weatherCondition;
	}

	public void setWeatherCondition(String weatherCondition) {
		this.weatherCondition = weatherCondition;
	}
	
	public LinkedList<Observer> debugObservers(){
		return this.observers;
	}

}
