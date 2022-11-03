package kr.co.ezenac.singleton02;

public class CarFactoryTest {

	public static void main(String[] args) {
		CarFactory carFactory = CarFactory.getInstance();
		Car bMWi4 = carFactory.createCar();
		Car bMWiX = carFactory.createCar();
		
		System.out.println(bMWi4.getCarNum());
		System.out.println(bMWiX.getCarNum());

	}

}
