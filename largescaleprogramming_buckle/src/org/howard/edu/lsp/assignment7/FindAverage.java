package org.howard.edu.lsp.assignment7;
import org.howard.edu.lsp.assignment7.EmptyListException;

import java.util.*;


public class FindAverage implements AverageStrategy{

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size() == 0){
			throw new EmptyListException("Operation cannot be peformed as given List is empty");
		}
		IntSummaryStatistics listAverage = grades.stream().mapToInt((a) -> a).summaryStatistics();
		int getAvg = (int)listAverage.getAverage();
		return getAvg;
	}

}