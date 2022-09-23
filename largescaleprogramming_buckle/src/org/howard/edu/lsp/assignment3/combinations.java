//README: Eclipse(on my side) was not allowing me to run it in the through driver like you requested.
//If it works on your side this code should be fine
// If Driver does not run do as follows: Uncomment the line above compute, uncomment the return foundcombos, uncomment the main() function and it will run 
package org.howard.edu.lsp.assignment3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class combinations{ 
	private static void findCombos(int counter, int[] num_list, int sum_value,List<List<Integer>> foundCombos, List<Integer> ifound) {
		if (counter == num_list.length) {//if loop has been gone through fully
			if (sum_value == 0) {//if the (used values summed up) - (the given value) = 0 then it is a combination
				//add the combination list to the array;
				foundCombos.add(new ArrayList<>(ifound));    //ifound is the list of combinations that is added to the main list.
				//this is one combination
			}
		return;//no more calculations needed
		}
		if (num_list[counter] <= sum_value) {//if number is less than or equal to given total(after previous calculations)
			//then go through loop OTHER go to line 31
			ifound.add(counter);    //add found index to ifound list
			
			if(counter>0) {								// THIS if statement was to get rid of the duplicate indices
				for (int i=0;i<ifound.size();i++) {   
					if (i == counter) {                  
//Since its going through ifound in order the current index is already in ifound.Therefore if the counter is equal an index currently in the ifound list it must skip to prevent duplication. feedback is welcome here on how to go about this.
						//System.out.println("STOP REPETAING");
						break;
					}	
				}
			findCombos(counter,num_list,sum_value - num_list[counter],foundCombos,ifound);   //recursively goes through array
			ifound.remove(ifound.size()-1);     
			}
		}
		findCombos(counter+1,num_list,sum_value,foundCombos,ifound);		
	}
	
	
	//public static List<List<Integer>> findsum(int[] num_list, int sum_value){
	public static void compute(int[] num_list, int sum_value){

		List<List<Integer>> foundCombos = new ArrayList<>();		//declare 2d array to store the list of combination index lists 
		findCombos(0,num_list,sum_value,foundCombos,new ArrayList<>());
		for (List<Integer> list: foundCombos ) {		//for each list in found combos we are going to then go through each list to print
			System.out.print("  [");
			for (Integer item : list) {
				System.out.print("  " +item+"  ");
			}
			System.out.println("], ");
		}
		System.out.println("]");
		//return foundCombos;
		
	}
	
	/*public static void main(String[] args) {
		//int[] num_list = {5,5,15,10};
		//int sum_value = 15;
		int[] num_list = {1,2,3,4,5,6};
		int sum_value = 6;
		List<List<Integer>> foundCombos = compute(num_list,sum_value);      //set destination for compute return 2d list to 
		
		for (List<Integer> list: foundCombos ) {		//for each list in found combos we are going to then go through each list to print
			System.out.print("  [");
			for (Integer item : list) {
				System.out.print("  " +item+"  ");
			}
			System.out.println("], ");
		}
		System.out.println("]");
	}*/
	
}

	