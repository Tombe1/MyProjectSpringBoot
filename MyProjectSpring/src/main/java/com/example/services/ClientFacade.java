package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.db.CompaniesDBDAO;
import com.example.db.CouponsDBDAO;
import com.example.db.CustomersDBDAO;

public abstract class ClientFacade {
	
	@Autowired
	protected CompaniesDBDAO compDB;
	@Autowired
	protected CouponsDBDAO coupDB;
	@Autowired
	protected CustomersDBDAO custDB;
	
	public abstract boolean login(String email, String password);

}
