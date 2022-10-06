package org.howard.edu.lsp.assignment4;

import java.util.ArrayList;
import java.util.List;



public class IntegerSet {
	private List<Integer> set = new ArrayList<Integer>();
	// Default Constructor
	public IntegerSet() {
		System.out.println("Filler");
	};
	
	
	/**
	 * Takes the IntegerSet used and removes all the internal members of the set
	 */
	public void clear() {
		set.clear();
		//System.out.println(set);
	};

	/**Length takes the integerset being used and finds the number of elements present
	 * @return the length of the set
	 * 
	 */
	public int length() {
		int lengthOfSet = set.size();
		return  lengthOfSet;
	};
	
	
	/** Modules sets are equal if they contain all of the same values in ANY order.
	 * @param  Number that must be searched for
	 * @return True if numbers match ; Return False if numbers do not match
	 * 
   */
	public boolean equals(IntegerSet b) {
		Integer firstLength = this.length();
		Integer secondLength = b.length();
		int numberMatches = 0;
		if (firstLength == secondLength) {
			for (int i = 0; i < set.size(); i++) {
				if (b.contains(set.get(i))) {
					numberMatches++;
				}
			}
			if (numberMatches == b.length()) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	/**
	 *  Returns true if the set contains the value, otherwise false
	 * @param  Number that must be searched for
	 * @return True if found, False if number is not present
	 */
	public boolean contains(int number) {
		for (int x = 0; x < set.size(); x++) {
			if (set.get(x) == number) {
				return true;
			}
		}
		return false;
	};
	
	/**Returns the largest item in the set; Throws a IntegerSetException if the set is empty 
	 * 
	 * @return Largest Value in the IntegerSet
	 * @throws IntegerSetException
	 */
	public int largest() throws IntegerSetException {
		if(set.size() == 0){
			throw new IntegerSetException("Operation cannot be peformed as given Set is empty.");
		}
		
		int maxVal = 0;
		for (int i = 0; i < set.size(); i++) {
			if (set.get(i) >= maxVal) {
				maxVal = set.get(i);
			}
		}
		return maxVal;
	};
	
	/**
	 *Returns the smallest item in the set; Throws a IntegerSetException if the set is empty
	 * 
	 * @return - integer value representing the smallest value in the set.
	 * @throws EmptySetException
	 */
	public int smallest() throws IntegerSetException{
		if(set.size() == 0){
			throw new IntegerSetException("Operation cannot be peformed as given Set is empty");
		}
		
		int minVal = set.get(0);
		for (int i = 1; i < set.size(); i++) {
			if (set.get(i) <= minVal) {
				minVal = set.get(i);
			}
		}
		return minVal;
	};	
	
	/**
	 * Adds an item to the set or does nothing it already there	
	 * @param integer value passed by user
	 */
	public void add(int item) {
		if (!this.contains(item)) {
			set.add(item);
		}
	};
	
	
	/**
	 *  Removes an item from the set or does nothing if not there
	 * @param integer value passed by user
	 */
	public void remove(int item) {
		if (this.contains(item)) {
			set.remove(Integer.valueOf(item));
		}
		

	}; 

	/**
	 * Compares given set to passed intSetB and makes the union. Numbers must not be repeated
	 * @param second integer set
	 */
	public void union(IntegerSet intSetb) {
		List<Integer> integerSetb = intSetb.convertForCalculation();
		for (int i = 0; i < integerSetb.size(); i++) {
			if (this.contains(integerSetb.get(i))) {
				continue;
			}
			else {
				this.add(integerSetb.get(i));
			}
		}
		
	};

	/**
	 * Compares given set to passed Set intsetB and makes a new set with the common numbers. This set is passed back to original set
	 * @param intSetb
	 */
	public void intersect(IntegerSet intSetb) {
	    
		List<Integer> integerSetb = intSetb.convertForCalculation();
		List<Integer> intersection = new ArrayList<Integer>();
		//this.retainAll(integerSetb);
		for (int i = 0; i < integerSetb.size(); i++) {
			if (this.contains(integerSetb.get(i))) {
				
				intersection.add(integerSetb.get(i));
			}
		}
		set = intersection;
	}; 

	/**
	 * Takes original set and takes the common ones from passed secondSet and removes them from original.
	 * Difference, i.e., s1 –s2
	 * @param intSetb - passed second integer set
	 */
	public void diff(IntegerSet intSetb) {
		List<Integer>  integerSetb = intSetb.convertForCalculation();
		set.removeAll(integerSetb);
	}; 


	/**
	 *  Returns true if the given set is empty, false otherwise
	 * @return True or False based on presence of any value
	 */
	boolean isEmpty() {
		int length = this.length();
		if (length ==0 ) {
			return true;
		}
		else {
			return false;
		}
	};
	/**Converts given Set to string so it is able to be printed
	 * 
	 * @return String version of given set
	 */
	public String toString() {
		String stringList = set.toString();
		return stringList;
	};
	/**Takes given sent and converts it for necessary calculation
	 * 
	 * @return converted set
	 */
	public List<Integer> convertForCalculation(){
		return set;
	};
}
