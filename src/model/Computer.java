package model;

public class Computer implements Comparable<Computer>{
	
	private String brand;
	private int ram;
	private int processors;
	private double processingSpeed;
	private char operatingSystem;
	
	public Computer(String brand, int ram, int processors, double processingSpeed, char operatingSystem) {
		this.brand = brand;
		this.ram = ram;
		this.processors = processors;
		this.processingSpeed = processingSpeed;
		this.operatingSystem = operatingSystem;
	}

	public String getBrand() {
		return brand;
	}

	public int getRam() {
		return ram;
	}

	public int getProcessors() {
		return processors;
	}

	public double getProcessingSpeed() {
		return processingSpeed;
	}

	public char getOperatingSystem() {
		return operatingSystem;
	}

	@Override
	public int compareTo(Computer oc) {
		int result = 0;
		if( brand.compareToIgnoreCase(oc.brand) < 0 )
			result = -1;
		else if( brand.compareToIgnoreCase(oc.brand) > 0 )
			result = 1;
		else
			result = 0;
		return result;
	}

	@Override
	public String toString() {
		String data = "";
		data += "\nBrand: " + brand;
		data += "\nRam: " + ram;
		data += "\nProcessors: " + processors;
		data += "\nProcessing speed: " + processingSpeed;
		data += "\nOperating system: " + operatingSystem;
		data += "\n";
		return data;
	}
	
}
