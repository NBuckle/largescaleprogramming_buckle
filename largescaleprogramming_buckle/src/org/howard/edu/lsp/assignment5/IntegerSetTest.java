package org.howard.edu.lsp.assignment5;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
//As seen in My assignment 4, the filler word keeps getting printed. I have google, Youtubed 
// and asked peers about the problem and they dont know how to resolve it either.
// I will continue to look into this before assignment 6
public class IntegerSetTest {
	private final IntegerSet testSet1 = new IntegerSet();
	@Test
	@DisplayName("Testing isEmpty method")
	public void SetisEmpty() {// SET is now [ ]
		assertTrue(testSet1.isEmpty());
	}
	@Test//SET is now [1]
	@DisplayName("Testing add method")
	public void testAddOneValue() {
		testSet1.add(1);
		assertFalse(testSet1.isEmpty());
	}
	@Test	// SET is now [1]
	@DisplayName("Testing isEmpty method after entering values")
	public void SetisNotEmpty() {
		testSet1.add(1);
		testSet1.add(2);
		assertFalse(testSet1.isEmpty());
	}	
	@Test	// SET is now [1]
	@DisplayName("Testing length method after first entry")
	public void LengthShouldBeOne() {
		testSet1.add(1);
		assertEquals(1,testSet1.length());
	}
	@Test// SET is now [1,2]
	@DisplayName("Testing isEmpty method")
	public void testAddSecondValue() {
		testSet1.add(1);
		testSet1.add(2);
		assertFalse(testSet1.isEmpty());
	}
	@Test//SET is now [1,2,3,4,5]
	@DisplayName("Testing length method after several entries")
	public void LengthShouldBeFive() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		assertEquals(5,testSet1.length());
	}
	@Test// SET is now [1,3,4,5]
	@DisplayName("Testing Remove method")
	public void SetLengthShouldbeThree() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.remove(2);
		assertEquals(3,testSet1.length());
	}
	@Test	// SET is now [1,3,4,5]
	@DisplayName("Testing Contains method for present value")
	public void SetContains4() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		assertTrue(testSet1.contains(4));
	}
	@Test	// SET is now [1,3,4,5]
	@DisplayName("Testing Contains method for value not present ")
	public void SetDoesNotContain6() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		assertFalse(testSet1.contains(6));
	}
	@Test	// SET is now []
	@DisplayName("Testing Clear method")
	public void SetShouldBeEmpty() {
		testSet1.add(1);
		testSet1.add(2);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.clear();
		assertTrue(testSet1.isEmpty());
	}
	private final IntegerSet testSet2 = new IntegerSet();
	@Test//SET is now [ ]
	@DisplayName("Testing isempty method on new set")
	public void Set2isEmpty() {
		assertTrue(testSet2.isEmpty());
	}
	@Test// SET 1 is now [1,3,4,5] & SET 2 is now [1,3,4,5]
	@DisplayName("Testing Equals method for equal sets")
	public void Set2EqualSet1() {
		testSet2.add(1);
		testSet2.add(3);
		testSet2.add(4);
		testSet2.add(5);
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		assertTrue(testSet1.equals(testSet2));
	}
	@Test//SET 1 is now [1,3,4,5] && SET 2 is now [1,3,5]
	@DisplayName("Testing Equals method for non equal set")
	public void Set2NotEqualSet1() {
		testSet2.add(1);
		testSet2.add(3);
		testSet2.add(5);
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.remove(4);
		assertFalse(testSet1.equals(testSet2));
	}
	@Test// SET 1 is now [1,3,4,5] & SET 2 is now [  ]
	@DisplayName("Testing equal method with null and populated set")
	public void Set2NotEqualNullSet() {
		testSet2.add(1);
		testSet2.add(3);
		testSet2.add(5);
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.clear();	
		assertFalse(testSet1.equals(testSet2));
	}	
	private final IntegerSet testSet3 = new IntegerSet();
	@Test	// SET 1 is now [1,3,4,5] & SET 2 is now [1,2,4,6,7,8]  & testSet3 = [1,2,3,4,5,6,7,8]
	@DisplayName("Testing Union method")
	public void Set1UnionSet2() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.add(1);		//Testset2
		testSet2.add(2);
		testSet2.add(4);
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(8);
		testSet3.add(1);//SET3
		testSet3.add(2);
		testSet3.add(3);
		testSet3.add(4);
		testSet3.add(5);
		testSet3.add(6);
		testSet3.add(7);
		testSet3.add(8);
		testSet2.union(testSet1);//UNION
		assertTrue(testSet2.equals(testSet3));
	}
	@Test // SET 1 is now [1,3,4,5] & SET 2 is now [1,2,4,6,7,8]  & testSet3 = [1,4]
	@DisplayName("Testing Intersect method")
	public void Set2InteresctSet1() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.add(1);//Testset2
		testSet2.add(2);
		testSet2.add(4);
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(8);
		testSet3.add(1);//SET3
		testSet3.add(4);
		testSet2.intersect(testSet1);//INTERSECT
		assertTrue(testSet2.equals(testSet3));
	}
	@Test	// SET 1 is now [1,3,4,5] & SET 2 is now [6,7,8]  & testSet3 = []
	@DisplayName("Testing intersection method with no similar items")
	public void Set2NOInteresctSet1() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.add(6);//Testset2
		testSet2.add(7);
		testSet2.add(8);
		testSet3.add(1);//SET3
		testSet3.clear();
		testSet2.intersect(testSet1);//Intersect
		assertTrue(testSet2.equals(testSet3));
	}
	@Test //SET 1 is now [1,3,4,5] & SET 2 is now [1,2,4,6,7,8]  & testSet3 = [2,6,7,8]
	@DisplayName("Testing DIfference method")
	public void Set2DiffSet1() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.add(1);		//Testset2
		testSet2.add(2);
		testSet2.add(4);
		testSet2.add(6);
		testSet2.add(7);
		testSet2.add(8);
		testSet3.add(2);//SET3
		testSet3.add(6);
		testSet3.add(7);
		testSet3.add(8);
		testSet2.diff(testSet1);//DIFFERENCE
		assertTrue(testSet2.equals(testSet3));
	}
	@Test // SET 1 is now [1,3,4,5] & SET 2 is now [6,7,8]  & testSet3 = [6,7,8]
	@DisplayName("Testing Difference method when there are no similar items")
	public void Set2NoDiffSet1() {
		testSet1.add(1);
		testSet1.add(3);
		testSet1.add(4);
		testSet1.add(5);
		testSet2.add(6);//Testset2
		testSet2.add(7);
		testSet2.add(8);
		testSet3.add(6);//SET3
		testSet3.add(7);
		testSet3.add(8);
		testSet2.diff(testSet1);		//DIFFERENCE
		assertTrue(testSet2.equals(testSet3));
	}
	@Test	// SET 1 is now [3,6,9]
	@DisplayName("Testing Smallest method")
	public void Set1SmallestShouldbe3() {
		testSet1.add(3);
		testSet1.add(6);
		testSet1.add(9);		
		try {
			assertEquals(3,testSet1.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test// SET 1 is now [3,6,9]
	@DisplayName("Testing smallest method on Null set")
	public void NullSet1SmallestShouldThrow() {
		testSet1.add(3);
		testSet1.add(6);
		testSet1.add(9);	
		testSet1.clear();
		try {
			assertEquals(3,testSet1.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test // SET 1 is now [3,6,9,-99]
	@DisplayName("Testing Smallest method with 1 negativ present")
	public void Set1SmallestWithNegative() {
		testSet1.add(3);
		testSet1.add(6);
		testSet1.add(9);
		testSet1.add(-99);		
		try {
			assertEquals(-99,testSet1.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test	// SET 1 is now [-3,-6,-9,-15]
	@DisplayName("Testing smallest method with all negatives")
	public void Set1SmallestAllNegative() {
		testSet1.add(-3);
		testSet1.add(-6);
		testSet1.add(-9);
		testSet1.add(-15);		
		try {
			assertEquals(-15,testSet1.smallest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test	// SET 1 is now [3,6,9,12]
	@DisplayName("Testing Largest method")
	public void Set1LargestAllPositive() {
		testSet1.add(3);
		testSet1.add(6);
		testSet1.add(9);
		testSet1.add(12);		
		try {
			assertEquals(12,testSet1.largest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test 	// SET 1 is now []
	@DisplayName("Testing Largest method on NUll set")
	public void NullSet1LargestMustThrow() {
		testSet1.add(3);
		testSet1.add(6);
		testSet1.add(9);
		testSet1.add(12);		
		testSet1.clear();
		try {
			assertEquals(12,testSet1.largest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
	@Test	// SET 1 is now [-3,-6,-9,-15]
	@DisplayName("Testing largest method on all negatives")
	public void Set1LargestAllNegative() {
		testSet1.add(-3);
		testSet1.add(-6);
		testSet1.add(-9);
		testSet1.add(-15);		
		try {
			assertEquals(-3,testSet1.largest());
		}
		catch (IntegerSetException EmptyError) {
			System.out.println(EmptyError.getMessage());
		}	
	};
}

