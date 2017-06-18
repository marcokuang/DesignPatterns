package org.marco.patterns.observer;

public interface Subject {
	public void registerObservers(Observer obs);
	public void removeObservers(Observer obs);
	public void notifyObservers();
}
