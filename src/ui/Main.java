package ui;

import model.ComputersSale;
import model.Computer;

public class Main {
	
	public static void main(String[] args) {
		int size = 100;
		ComputersSale css = new ComputersSale(ComputersSale.generateRandomComputers(size));
		css.sortByBrand();
		printArrays(css.getComps());
		css.sortByProcessing();
		printArrays(css.getComps());
		css.sortByBrandAndOS();
		printArrays(css.getComps());
		css.sortByRam();
		printArrays(css.getComps());
		css.sortByBrandReverse();
		printArrays(css.getComps());
	}
	
	public static void printArrays( Computer[] cs ) {
		System.out.println("-------------------------------------------------------");
		for( int i = 0 ; i < cs.length ; i++ ) {
			System.out.println(cs[i]);
		}
		System.out.println("-------------------------------------------------------");
	}

}
