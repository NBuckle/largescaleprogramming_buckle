package org.howard.edu.lsp.assignment7;

import java.util.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Integer> grades = new ArrayList<>();
		grades.add(10);
		grades.add(30);
		grades.add(50);
		grades.add(20);
		grades.add(70);
		grades.add(40);
		grades.add(90);
		grades.add(60);
		grades.add(80);
		FindAverage foundAve = new FindAverage();
		int testAve = 0;
		try {
			testAve = foundAve.compute(grades);
			System.out.println("Average of list is 50.\nHere is result: " + testAve);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		AverageDrop dropped = new AverageDrop();
		int testAveDrop = 0;
		try {
			testAveDrop = dropped.compute(grades);
			System.out.println("\nAverage of list after dropping 10 and 20 is 60.\nHere is result: " + testAveDrop);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}