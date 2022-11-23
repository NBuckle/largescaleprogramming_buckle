package org.howard.edu.lsp.assignment7;
import org.howard.edu.lsp.assignment7.EmptyListException;
import java.util.*;

public class AverageDrop implements AverageStrategy {

	@Override
	public int compute(List<Integer> grades) throws EmptyListException {
		// TODO Auto-generated method stub
		if(grades.size() == 0 || grades.size() <=2){
			throw new EmptyListException("Operation cannot be peformed as the size of the list is not big enough");
		}
		Collections.sort(grades);
		grades.remove(0);
		grades.remove(0);
		IntSummaryStatistics listAverage = grades.stream().mapToInt((a) -> a).summaryStatistics();
		int averageDrop =(int) listAverage.getAverage();
		return averageDrop;
	}

}