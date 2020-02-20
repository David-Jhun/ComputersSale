package model;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class ComputersSale {
	
	private Computer[] comps;

	public ComputersSale(Computer[] comps) {
		this.comps = comps;
	}
	
	public ComputersSale() {
		
	}

	public Computer[] getComps() {
		return comps;
	}
	
	public void sortByBrand() {
		for( int i = 1 ; i < comps.length ; i++ ) {
			for( int j = i ; j > 0 && comps[j - 1].compareTo(comps[j]) > 0 ; j-- ) {
				Computer cs = comps[j];
				comps[j] = comps[j - 1];
				comps[j - 1] = cs;
			}
		}
	}

	public void sortByProcessing() {
		Comparator<Computer> compareByProcessing = new SortComputersByProcessing();
		Arrays.sort(comps, compareByProcessing);
	}
	
	public void sortByBrandAndOS() {
		Comparator<Computer> compareByBrandOS = new SortComputersByBrandOS();
		Arrays.sort(comps, compareByBrandOS);
	}
	
	public void sortByRam() {
		Comparator<Computer> compareByRam = new Comparator<Computer>() {
			@Override
			public int compare(Computer o1, Computer o2) {
				int result = 0;
				int ram1 = o1.getRam();
				int ram2 = o2.getRam();
				if( ram1 < ram2 )
					result = -1;
				else if( ram1 > ram2 )
					result = 1;
				else
					result = 0;
				return result;
			}
		};
		Arrays.sort(comps, compareByRam);
	}
	
	public void sortByBrandReverse() {
		Comparator<Computer> compareBrandReverse = new SortComputersByBrandOS();
		Arrays.sort(comps, Collections.reverseOrder(compareBrandReverse));
	}
	
	public static Computer[] generateRandomComputers( int c ) {
		Computer[] computers = new Computer[ c ];
		Random random = new Random();
		String[] brands = {"Asus", "Lenovo", "Acer", "HP", "Apple"};
		char[] operativeSystems = {'W', 'L', 'M'};
		for( int i = 0 ; i < computers.length ; i++ ) {
			String brand = brands[random.nextInt(4)];
			int ram = 1 + random.nextInt(31);
			int processors = 1 + random.nextInt(7);
			double processingSpeed = random.nextDouble();
			char operatingSystem = operativeSystems[random.nextInt(3)];
			Computer cs = new Computer(brand, ram, processors, processingSpeed, operatingSystem);
			computers[i] = cs;
		}
		return computers;
	}

}
