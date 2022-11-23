package org.howard.edu.lsp.assignment7;
import org.howard.edu.lsp.assignment7.EmptyListException;

import java.util.*;


public class FindAverage implements AverageStrategy{
	/**
	 * Calculates Average from Given list
	 * @throws EmptyListException
	 * @param List<Integer> grades
	 * @return int getAvg
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		if(grades.size() == 0){
			throw new EmptyListException("Operation cannot be peformed as given List is empty");
		}
		IntSummaryStatistics listAverage = grades.stream().mapToInt((a) -> a).summaryStatistics();	//Allows for .getAverage() function to be performed
		int getAvg = (int)listAverage.getAverage();  	//COnvert average form .getAverage() to an int as we return an int
		return getAvg;
	}

}