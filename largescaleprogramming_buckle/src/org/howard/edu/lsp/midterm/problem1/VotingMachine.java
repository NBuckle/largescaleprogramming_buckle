package org.howard.edu.lsp.midterm.problem1;
import java.util.HashMap;

public class VotingMachine {	
	// YOU must decide upon an appropriate data representation to associate a name with respective votes.  Create whatever you like.
	public HashMap <String,Integer> Candidates = new HashMap<String,Integer>(); 
	public VotingMachine() {};
	public void addCandidate(String name) {
		// Add a candidate to the list, initialize number of votes to 0
		int candidateVotes = 0; //initial number of votes is 0
		Candidates.put(name, candidateVotes); //adding a new entry to the HashMap
	}
	
	public void castVotes(String name, int numVotes) {
		// Cast votes to the candidate with the given name
		int candidateVotes = Candidates.get(name);
		candidateVotes = candidateVotes + numVotes;
		Candidates.put(name, candidateVotes);
	}
	
	public int getVotes(String name)  throws UnknownCandidateException {
		// Return the number of votes for a given candidate. 
		// Throws UnknownCandidateException if name not present.   
			// Make this a checked exception.
		if (Candidates.containsKey(name)!= true) {
			throw new UnknownCandidateException("Candidate cannot be found");
		}
		else {return Candidates.get(name);}
		
	}

	public int sum() {
		// Return the total number of votes for all candidates.	
		int total = Candidates.values().stream().mapToInt(Integer::intValue).sum();
		return total;		
	}
}
