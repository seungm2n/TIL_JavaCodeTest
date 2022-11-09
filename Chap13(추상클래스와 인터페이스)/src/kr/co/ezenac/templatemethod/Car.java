package kr.co.ezenac.templatemethod;

public abstract class Car {

	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}

	private void turnOff() {
		System.out.println("시동을 끕니다");		
	}

	public abstract void stop();

	public abstract void drive();

	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
}







