package com.example.LoginManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import com.example.exceptions.InvalidClientTypeException;
import com.example.exceptions.WrongAdminDetailsException;
import com.example.exceptions.WrongCompanyDetailsException;
import com.example.exceptions.WrongCustomerDetailsException;
import com.example.services.AdminFacade;
import com.example.services.ClientFacade;
import com.example.services.CompaniesFacade;
import com.example.services.CustomersFacade;

@Component
public class LoginManager {

	@Autowired
	private ConfigurableApplicationContext ctxt;

	public ClientFacade login(String email, String password, ClientType type) throws InvalidClientTypeException,
			WrongAdminDetailsException, WrongCompanyDetailsException, WrongCustomerDetailsException {
		switch (type) {
		case Admin:
			AdminFacade adminFacade = ctxt.getBean(AdminFacade.class);
			if (adminFacade.login(email, password)) {
				return adminFacade;
			} else {
				throw new WrongAdminDetailsException();
			}
		case Company:
			CompaniesFacade companiesFacade = ctxt.getBean(CompaniesFacade.class);
			if (companiesFacade.login(email, password)) {
				return companiesFacade;
			} else {
				throw new WrongCompanyDetailsException();
			}
		case Customer:
			CustomersFacade customersFacade = ctxt.getBean(CustomersFacade.class);
			if (customersFacade.login(email, password)) {
				return customersFacade;
			} else {
				throw new WrongCustomerDetailsException();
			}

		default:
			throw new InvalidClientTypeException();
		}
	}
}
