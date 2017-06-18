package org.marco.patterns.singleton;

import java.io.Serializable;

public class Singleton {
	public static interface Animal extends Serializable{
		public void makeSound();
	}
	
	public static class Dog implements Animal{
		/**
		 * 
		 */
		private static final long serialVersionUID = -9003459364464580402L;
		public void makeSound() {
			bark();
		}
		private void bark(){
			System.out.println("Bark!!!");
		}
	}
	
	public static class Cat implements Animal{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1633212998593932539L;

		public void makeSound() {
			// TODO Auto-generated method stub
			Meow();
		}

		private void Meow() {
			// TODO Auto-generated method stub
			System.out.println("Meow~~~");
		}
		
	}
	
	public static void main(String[] args){
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound();
		cat.makeSound();
	}

}
