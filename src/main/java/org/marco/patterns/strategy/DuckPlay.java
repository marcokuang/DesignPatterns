package org.marco.patterns.strategy;

public class DuckPlay {
	public static interface FlyBehavior{
		public void fly();
	}
	
	public static interface QuarkBehavior{
		public void quark();
	}
	
	public static class FlyNoWays implements FlyBehavior{

		public void fly() {
			// TODO Auto-generated method stub
			cantFly();
		}

		private void cantFly() {
			// TODO Auto-generated method stub
			System.out.println("This duck can't fly");
			
		}
		
	}
	
	public static class FlyWithWings implements FlyBehavior{

		public void fly() {
			// TODO Auto-generated method stub
			flyHappily();
		}

		private void flyHappily() {
			// TODO Auto-generated method stub
			System.out.println("Fly to the sky!");
		}
		
	}
	
	public static class Quark implements QuarkBehavior{

		public void quark() {
			// TODO Auto-generated method stub
			normalSound();
		}

		private void normalSound() {
			// TODO Auto-generated method stub
			System.out.println("Quark!");
		}
		
	}
	
	public static class Squeak implements QuarkBehavior{

		public void quark() {
			// TODO Auto-generated method stub
			squeak();
		}

		private void squeak() {
			// TODO Auto-generated method stub
			System.out.println("Squak by rubbie!");
		}
		
	}
	
	public static class MuteDuck implements QuarkBehavior{

		public void quark() {
			// TODO Auto-generated method stub
			noSoundAtAll();
		}

		private void noSoundAtAll() {
			// TODO Auto-generated method stub
			System.out.println("SILENCE~~~~~");
		}
		
	}
	
	public static class Duck{
		protected FlyBehavior flyBehavior;
		protected QuarkBehavior quarkBehavior;
		public void swim(){
			String swim = "I like swimming.";
		}
		public FlyBehavior getFlyBehavior() {
			return flyBehavior;
		}
		public void setFlyBehavior(FlyBehavior flyBehavior) {
			this.flyBehavior = flyBehavior;
		}
		public QuarkBehavior getQuarkBehavior() {
			return quarkBehavior;
		}
		public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
			this.quarkBehavior = quarkBehavior;
		}
		public void display(){
			System.out.println("I am a duck");
		}
		public void performFly(){
			this.flyBehavior.fly();
		}
		public void performQuark() {
			this.quarkBehavior.quark();
		}
		public Duck(){
			this.flyBehavior = new FlyWithWings();
			this.quarkBehavior = new Quark();
		}
		
	}
	
	public static class MallardDuck extends Duck{
		public MallardDuck(){
			this.flyBehavior = new FlyWithWings();
			this.quarkBehavior = new Squeak();
		}
		public void display(){
			String info = "looks like a mallard";
			System.out.println(info);
		}
		
	}
	
	public static class RubberDuck extends Duck{
		public RubberDuck(){
			setFlyBehavior(new FlyNoWays());
			setQuarkBehavior(new MuteDuck());
		}
		
		public void display(){
			String info = "looks like a rubberduck";
			System.out.println(info);
		}
		
	}
	
	public static class RocketFly implements FlyBehavior{

		public void fly() {
			// TODO Auto-generated method stub
			System.out.println("Rocket to the space!!!!");
		}
		
	}
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.performFly();
		duck.performQuark();
		Duck rubber = new RubberDuck();
		rubber.performFly();
		rubber.performQuark();
		rubber.setFlyBehavior(new RocketFly());
		rubber.performFly();
	}
}
