package model;

import java.util.Comparator;

public class SortComputersByProcessing implements Comparator<Computer>{

	@Override
	public int compare(Computer computer1, Computer computer2) {
		int result = 0;
		double velocity1 = computer1.getProcessors() * computer1.getProcessingSpeed();
		double velocity2 = computer2.getProcessors() * computer2.getProcessingSpeed();
		if( velocity1 < velocity2 )
			result = -1;
		else if( velocity1 > velocity2 )
			result = 1;
		else
			result = 0;
		return result;
	}

}
