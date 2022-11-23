package org.howard.edu.lsp.assignment7;
import org.howard.edu.lsp.assignment7.EmptyListException;
import java.util.*;

public class AverageDrop implements AverageStrategy {
	/**
	 * Calculates Average from Given list after dropping two smallest values
	 * @throws EmptyListException
	 * @param List<Integer> grades
	 * @return int averageDrop
	 */
	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size() == 0 || grades.size() <=2){
			throw new EmptyListException("Operation cannot be peformed as the size of the list is not big enough");
		}
		Collections.sort(grades);
		grades.remove(0);
		grades.remove(0);
		IntSummaryStatistics listAverage = grades.stream().mapToInt((a) -> a).summaryStatistics();//Allows for .getAverage() function to be performed
		int averageDrop =(int) listAverage.getAverage();	//COnvert average form .getAverage() to an int as we return an int
		return averageDrop;
	}

}