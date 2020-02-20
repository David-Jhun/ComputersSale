package model;

import java.util.Comparator;

public class SortComputersByBrandOS implements Comparator<Computer>{

	@Override
	public int compare(Computer o1, Computer o2) {
		int result = 0;
		String brand1 = o1.getBrand();
		String brand2 = o2.getBrand();
		int os1 = o1.getOperatingSystem();
		int os2 = o2.getOperatingSystem();
		if( brand1.compareToIgnoreCase(brand2) < 0 )
			result = -1;
		else if( brand1.compareToIgnoreCase(brand2) > 0 )
			result = 1;
		else if( brand1.compareToIgnoreCase(brand2) == 0 ) {
			if( os1 < os2 )
				result = -1;
			else if( os1 > os2 )
				result = 1;
		}
		return result;
	}

}
