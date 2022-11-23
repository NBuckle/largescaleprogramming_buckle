package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	public EmptyListException() {}
	/**
	 * Throws and error message based on given Criteria
	 * @throws EmptyListException
	 * @param String problem
	 * 
	 */
	public EmptyListException(String problem) {
        super(problem);
	}

}
