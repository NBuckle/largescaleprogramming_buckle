package org.howard.edu.lsp.midterm.problem1;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import java.util.HashMap;

public class VotingMachineTest {
	public HashMap<String,Integer> Candidates = new HashMap<String,Integer>();
	VotingMachine testMachine = new VotingMachine();
	/**
	 * Test Checks if Add Candidate has 0 Number of Votes
	 * @throws UnknownCandidateException
	 */
	@Test
	@DisplayName ("Test getVotes")
	public void testAddCandidate() throws UnknownCandidateException{
		testMachine.addCandidate("Nikolas");
		assertEquals(0,testMachine.getVotes("Nikolas"));
	}
	/**
	 * Test Checks if when 50 votes casted, Candidate has 50 Number of Votes
	 * @throws UnknownCandidateException
	 */
	@Test
	@DisplayName ("Test getVotes")
	public void testGetVotes() throws UnknownCandidateException{
		testMachine.addCandidate("Jerome");
		testMachine.castVotes("Jerome",50);
		int machine1Votes = testMachine.getVotes("Jerome");
		assertEquals(50,machine1Votes);
	}
	/**
	 * Test Checks if exception is thrown for missing Candidate
	 * @throws UnknownCandidateException
	 */
	@Test
	@DisplayName ("Test missing getVotes")
	public void testmissingGetVotes() throws UnknownCandidateException{
		try {
			int missingMachine = testMachine.getVotes("Buckle");
			assertThrows(UnknownCandidateException.class, () -> testMachine.getVotes("Buckle"));
		}
		catch(UnknownCandidateException MissingError) {
			System.out.println(MissingError.getMessage());
		}
	}
	/**
	 * Test Checks if Sum of votes for Machine2 (Gio: 9  Natalie: 7 ; 9+7 =16) 
	 */
	@Test
	@DisplayName ("Test sum Function")
	public void tesSum(){
		VotingMachine testMachine2 = new VotingMachine();
		testMachine2.addCandidate("Gio");
		testMachine2.castVotes("Gio",7);
		testMachine2.addCandidate("Natalie");
		testMachine2.castVotes("Natalie",9);
		int machine2sum = testMachine2.sum();
		assertEquals(16,machine2sum);
		
	}
}