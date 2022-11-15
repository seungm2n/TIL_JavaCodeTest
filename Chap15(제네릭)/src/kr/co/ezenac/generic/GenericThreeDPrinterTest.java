package kr.co.ezenac.generic;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		
		GenericThreeDPrinter<Powder> powerPrinter = new GenericThreeDPrinter<>();
		Powder powder = new Powder();
		powerPrinter.setMaterial(powder);
		System.out.println(powerPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		powerPrinter.print();
		plasticPrinter.print();

	}

}
