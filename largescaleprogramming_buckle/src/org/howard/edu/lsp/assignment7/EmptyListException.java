package org.howard.edu.lsp.assignment7;

public class EmptyListException extends Exception {
	public EmptyListException() {}
	public EmptyListException(String problem) {
        super(problem);
	}

}
