package org.howard.edu.lsp.assignment7;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.howard.edu.lsp.midterm.problem1.UnknownCandidateException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AverageTest {
	List <Integer> grades = new ArrayList<>();
	FindAverage foundAve = new FindAverage();
	AverageDrop dropped = new AverageDrop();
	/**
	 * Test if Exception is thrown For Empty List
	 * @throws EmptyListException
	 */
	@Test
	@DisplayName ("Test if Exception is thrown For Empty List")
	public void AverageEmpty() {
		try {
			foundAve.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Test if Average is 50 for given list
	 * 
	 */
	@Test
	@DisplayName ("Test Compute for FindAverage")
	public void AverageFifty() {
		int testAve = 0;
		grades.add(10);
		grades.add(30);
		grades.add(50);
		grades.add(20);
		grades.add(70);
		grades.add(40);
		grades.add(90);
		grades.add(60);
		grades.add(80);
		try {
			testAve = foundAve.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(50,testAve);
	}
	/**
	 * Test if Exception is thrown For Empty List
	 * @throws EmptyListException
	 */
	@Test
	@DisplayName ("Test Exception for empty list in Compute in AverageDrop")
	public void AverageDropEmpty() {
		try {
			dropped.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Test if Exception is thrown For Inadequate List
	 * @throws EmptyListException
	 */
	@Test
	@DisplayName ("Test Exception for list size 1 in Compute in AverageDrop")
	public void AverageDropOneVal() {
		grades.add(10);
		try {
			dropped.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Test if Exception is thrown For Inadequate List
	 * @throws EmptyListException
	 */
	@Test
	@DisplayName ("Test Exception for list size 2 in Compute in AverageDrop")
	public void AverageDropTwoVal() {
		grades.add(10);
		grades.add(30);
		try {
			dropped.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * Test if Average is 60 After Dropping Two Smallest value
	 * 
	 */
	@Test
	@DisplayName ("Test Average for AverageDrop")
	public void AverageSixtyDrop() {
		int testAve = 0;
		grades.add(10);
		grades.add(30);
		grades.add(50);
		grades.add(20);
		grades.add(70);
		grades.add(40);
		grades.add(90);
		grades.add(60);
		grades.add(80);
		try {
			testAve = dropped.compute(grades);
		} catch (EmptyListException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(60,testAve);
	}

}