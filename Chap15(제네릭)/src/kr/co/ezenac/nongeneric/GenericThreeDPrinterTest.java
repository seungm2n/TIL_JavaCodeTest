package kr.co.ezenac.nongeneric;

public class GenericThreeDPrinterTest {

	public static void main(String[] args) {
		GenericThreeDPrinter<Powder> powerPrinter = new GenericThreeDPrinter<>();
		powerPrinter.setMaterial(new Powder());
		System.out.println(powerPrinter);
		
		GenericThreeDPrinter<Plastic> plasticPrinter = new GenericThreeDPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

	}

}
