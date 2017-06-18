package org.marco.patterns;
import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;
import org.marco.patterns.observer.Bedroom;
import org.marco.patterns.observer.LivingRoom;
import org.marco.patterns.observer.Observer;
import org.marco.patterns.observer.OracleBuilding;
import org.marco.patterns.observer.WeatherObserver;
import org.marco.patterns.observer.WeatherReport;

public class WeatherReportTest {

	@Test
	public void testRegisterObservers() {
		WeatherReport report = new WeatherReport();
		Bedroom bedroom = new Bedroom();
		LivingRoom livingRoom = new LivingRoom();
		WeatherObserver weatherObserver = new WeatherObserver();
		OracleBuilding oBuilding = new OracleBuilding();
		
		report.registerObservers(bedroom);
		report.registerObservers(livingRoom);
		report.registerObservers(weatherObserver);
		
		report.setTemperature(65);
		report.setWeatherCondition("Cloudy");
		report.notifyObservers();
		report.setTemperature(42);
		report.setWeatherCondition("Snowing");
		report.notifyObservers();
		
		LinkedList<Observer> result = report.debugObservers();
		assertTrue(result.contains(weatherObserver));
		assertTrue(result.contains(bedroom));
		assertTrue(result.contains(livingRoom));
		assertFalse(result.contains(oBuilding));
	}

//	@Test
//	public void testRemoveObservers() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testNotifyObservers() {
//		fail("Not yet implemented");
//	}

}
