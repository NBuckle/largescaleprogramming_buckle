package org.howard.edu.lsp.assignment5;
import  org.howard.edu.lsp.assignment5.IntegerSet;
/**
 * 
 * @author Nikolas Buckle
 *
 */
public class Driver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntegerSet set1 = new IntegerSet();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		IntegerSet set2 = new IntegerSet();
		//set2.add(6);
		set2.add(3);
		set2.add(2);
		set2.add(1);
		IntegerSet set3 = new IntegerSet();
		IntegerSet set4 = new IntegerSet();
		set3.add(1);
		set3.add(2);
		set3.add(3);
		set3.add(4);
		set4.add(1);
		set4.add(2);
		set4.add(5);
		set4.add(6);
		IntegerSet setNotEqual = new IntegerSet();
		setNotEqual.add(10);
		setNotEqual.add(20);
		setNotEqual.add(30);
		setNotEqual.add(40);
		
		System.out.println("ROBUST TEST CASES INCOMING");
		//TEST ADD
		System.out.println("The add method was used to add the numbers [1,2,3]. Here is RESULT: " + set1.toString());
		//TEST LENGTH
		System.out.println("The add method added 3 numbers to set1. Length displayed should be 3. Here is Result: " + set1.length());	
		//TEST EQUALS
		System.out.println("\nSET 1 is[1,2,3]\nSet 2 is [3,2,1].\nSet1 is equal to Set2. The Equals Method will run and should print 'True'. Here is result: "  + set1.equals(set2));
		System.out.println("\nSET 1 is[1,2,3]\nSet 2 is [10,20,30,40].\nSet1 is NOT equal to Set2. The Equals Method will run and should print 'False'. Here is result: "  + set1.equals(setNotEqual));
		//TEST CLEAR
		set1.clear();
		System.out.println("\nTest to see CLEAR set1 Method. Should print []. Here is result: " + set1.toString());

		//TEST REMOVE
		set2.remove(3);
		System.out.println("\nRemove Method removed integer 3. Change should be from [3,2,1] to [2,1]. Here is Result: " + set2.toString());
		
		//=============================TEST UNION
		set4.union(set3);
		System.out.println("\nUNION TEST 1\nSet3 = [1,2,3,4]   Set4 = [1,2,5,6]    UNION=[1,2,3,4,5,6].\nAfter running Union Method result is: " + set4.toString());
		IntegerSet set20 = new IntegerSet();
		IntegerSet set21 = new IntegerSet();
		set20.add(10);
		set20.add(20);
		set20.add(80);
		set21.add(70);
		set21.add(20);
		set21.add(10);
		set21.add(40);
		set20.union(set21);
		System.out.println("\nUNION Test 2\nFirst Set = [10,20,80]   Second Set = [70,20,10,40]    UNION=[10,20,80,70,40].\nAfter running Union Method result is: " + set20.toString());
		
		IntegerSet set8 = new IntegerSet();
		IntegerSet set7 = new IntegerSet();
		set7.add(3);
		set7.add(2);
		set7.add(8);
		set7.add(7);
		set8.add(2);
		set8.add(6);
		set8.add(4);
		set8.add(7);

		//TEST INTERSECT 1
		set8.intersect(set7);
		System.out.println("\nINTERSECTION TEST 1\nSet 7 = [3,2,8,7]  Set8 = [2,6,4,7]  Intersection should print [2,7]\nTesting Intersect Method result: " + set8.toString());
		
		IntegerSet set5 = new IntegerSet();
		IntegerSet set6 = new IntegerSet();
		set5.add(1);
		set5.add(2);
		set5.add(3);
		set5.add(4);
		set6.add(1);
		set6.add(2);
		set6.add(5);
		set6.add(6);
		
		//TEST INTERSECT 2
		set5.intersect(set6);
		System.out.println("\nINTERSECTION TEST 2\nSet 5 [1,2,3,4]   Set 6 = [1,2,5,6]   Intersection shoudl print [1,2]\nTesting Intersect Method Result: " + set5.toString());
		
		IntegerSet set9 = new IntegerSet();
		IntegerSet set10 = new IntegerSet();
		set9.add(1);
		set9.add(2);
		set9.add(3);
		set9.add(4);
		set10.add(1);
		set10.add(2);
		set10.add(5);
		set10.add(6);
		
		//TEST DIFFERENCE
		set9.diff(set10);
		System.out.println("Set 9 =[1,2,3,4]   Set 10 = [1,2,5,6]  Difference = [3,4]\nDiff Method when set 9 is used had result: " + set9.toString());
		
		
		//TEST IS EMPTY
		IntegerSet set11 = new IntegerSet();
		set11.add(6);
		System.out.println("Set 11 = [6]. Is empty should be false: " + set11.isEmpty() + "\n");
		set11.remove(6);
		System.out.println("Set 11 = []. Is empty should be True: " + set11.isEmpty() + "\n");

		
		//=====================SMALLEST==========================
		//TRY SMALLEST ON EMPTY SET
		IntegerSet set14 = new IntegerSet();
		try {
			System.out.println("Set 10 = [1,2,5,6].Testing Smallest Method on an empty set. Should print error " + set14.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println("TRIED TO DO SMALLEST METHOD ERROR OCCURED");		
			System.out.println(EmptyError.getMessage());
		}
		//TRY SMALLEST ON POPULATED set
		try {
			System.out.println("\nSet 10 = [1,2,5,6].Testing Smallest Method: " + set10.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println("TRIED TO DO SMALLEST METHOD ERROR OCCURED");		
			System.out.println(EmptyError.getMessage());
		}
		
		//======================LARGEST==================
		//TRY LARGEST ON EMPTY SET
		IntegerSet set15 = new IntegerSet();
		try {
			System.out.println("\nSet 10 = [1,2,5,6].Testing Largest Method on an empty set. Should print error: " + set15.largest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}
		// TRY LARGEST ON POPULATED SET
		try {
			System.out.println("\nSet 10 = [1,2,5,6].Testing Largest Method: " + set10.largest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}

	}

}
