package org.howard.edu.lsp.midterm.problem1;

public class UnknownCandidateException extends Exception{
	public UnknownCandidateException() {}
	public UnknownCandidateException(String problem) {
		super(problem);
	}
}
