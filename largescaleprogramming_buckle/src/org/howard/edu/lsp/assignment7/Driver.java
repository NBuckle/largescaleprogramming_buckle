package org.howard.edu.lsp.assignment7;

import java.util.*;

public class Driver {
	/**
	 * Uses printOut statements to test FindAverage and AverageDrop
	 * @throws EmptyListException
	 * @param 
	 * @return 
	 */
	public static void main(String[] args) {
		List <Integer> grades = new ArrayList<>();
		grades.add(10);		//the .add() functions adds the passed integer to the list
		grades.add(30);
		grades.add(50);
		grades.add(20);
		grades.add(70);
		grades.add(40);
		grades.add(90);
		grades.add(60);
		grades.add(80);
		FindAverage foundAve = new FindAverage();   //new instance of FindAverage
		int testAve = 0;
		try {
			testAve = foundAve.compute(grades); 	//use compute function from FindAverage file
			System.out.println("Average of list is 50.\nHere is result: " + testAve);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
		AverageDrop dropped = new AverageDrop();		//new instance of AverageDrop
		int testAveDrop = 0;
		try {
			testAveDrop = dropped.compute(grades);	//use compute function from AverageDrop file
			System.out.println("\nAverage of list after dropping 10 and 20 is 60.\nHere is result: " + testAveDrop);
		} catch (EmptyListException e) {
			e.printStackTrace();
		}
	}

}