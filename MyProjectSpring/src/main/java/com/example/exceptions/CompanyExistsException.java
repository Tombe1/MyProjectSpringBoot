package com.example.exceptions;

public class CompanyExistsException extends Exception {
	
	
	public CompanyExistsException() {
		super("Company was not found!");
	}

}
