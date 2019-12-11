package com.example.exceptions;

public class CompanyNotFoundException extends Exception {
	
	public CompanyNotFoundException() {
		super("Company was not found!");
	}


}
