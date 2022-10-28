package org.howard.edu.lsp.midterm.problem2;

import java.util.Arrays;

import org.howard.edu.lsp.assignment5.IntegerSet;

public class Person { 
private String name; 
private int age; 
private String socialSecurityNumber;

	public Person(String name,  String socialSecurityNumber, int age) {
		// initialize private variables
		this.name = name;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	
	public String toString() {
		String converted = name + " " + age + " " +socialSecurityNumber ;
		return converted;
	}
	
	public String equals(Person p2){
		int numberMatches = 0;
		char firstArray[] = this.socialSecurityNumber.toCharArray();
		char secondArray[] = p2.socialSecurityNumber.toCharArray();		
		for (int i = 0; i <=10 ; i++) {
			if (firstArray[i] == secondArray[i]) {
				numberMatches++;  //character in same position match
			}
		}
		if (numberMatches == 11) {
			return "These are the same";
		}
		else {
			return "These are not the same";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Nik","111-11-1111",26);
		Person p2 = new Person("Joe","111-11-1111",36);
		Person p3 = new Person("Gary","111-22-1111",46);
		System.out.println("==============DRIVER TEST CASES=================");
		System.out.println("==============Name TEST CASES=================");
		System.out.println("P1 name should be Nik. Here is result: "+ p1.name);
		System.out.println("P2 name should be Joe. Here is result: "+ p2.name);
		System.out.println("P3 name should be Gary. Here is result: "+ p3.name);
		System.out.println("==============Age TEST CASES=================");
		System.out.println("P1 age should be 26. Here is result: " + p1.age);
		System.out.println("P2 age should be 36. Here is result: " + p2.age);
		System.out.println("P3 age should be 46. Here is result: " + p3.age);
		System.out.println("==============SSN TEST CASES=================");
		System.out.println("P1 SSN should be 111-11-1111. Here is result: " + p1.socialSecurityNumber);
		System.out.println("P2 SSN should be 111-11-1111. Here is result: " + p2.socialSecurityNumber);
		System.out.println("P3 SSN should be 111-22-1111. Here is result: " + p3.socialSecurityNumber);
		System.out.println("==============TO STRING TEST CASES=================");
		System.out.println("P1 to string should be: Nik 26 111-11-1111. Here is Result: " + p1.toString());
		System.out.println("P2 to string should be: Joe 36 111-11-1111. Here is Result: " + p2.toString());
		System.out.println("P3 to string should be: Gary 46 111-22-1111. Here is Result: " + p3.toString());
		System.out.println("==============EQUALS TEST CASES=================");
		System.out.println("P1 EQUALS P2 is TRUE. Should print 'These are the same'. Here is result: " + p1.equals(p2));
		System.out.println("P1 EQUALS P3 is FALSE. Should print 'These are not the same'. Here is result:  " + p1.equals(p3));
	
	}
} 
