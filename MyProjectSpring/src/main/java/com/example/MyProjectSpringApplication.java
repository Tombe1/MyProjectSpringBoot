package com.example;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.LoginManager.ClientType;
import com.example.LoginManager.LoginManager;
import com.example.beans.Categories;
import com.example.beans.Companies;
import com.example.beans.Coupons;
import com.example.beans.Customers;
import com.example.db.CompaniesDBDAO;
import com.example.db.CouponsDBDAO;
import com.example.exceptions.CompanyExistsException;
import com.example.exceptions.CompanyNotFoundException;
import com.example.exceptions.CouponCantBeAddedException;
import com.example.exceptions.CustomerCantBeAddedException;
import com.example.exceptions.CustomerNotFoundException;
import com.example.exceptions.InvalidClientTypeException;
import com.example.job.DailyJob;
import com.example.services.AdminFacade;
import com.example.services.CompaniesFacade;
import com.example.services.CustomersFacade;

@SpringBootApplication
public class MyProjectSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MyProjectSpringApplication.class, args);

		CouponsDBDAO coupDB = ctx.getBean(CouponsDBDAO.class);
		
		// Tests:
		
		// JOB METHOD WORKING:
//		DailyJob t1 = ctx.getBean(DailyJob.class);
//		Thread job = new Thread(t1);
//		job.start();

		LoginManager loginMan = ctx.getBean(LoginManager.class);
		try {
			
			
			
			//Admin Tests:  **ALL WORKING
			
			AdminFacade admin = (AdminFacade) loginMan.login("admin@admin.com", "admin", ClientType.Admin); //Working
	//		Companies comp = new Companies("Intel111", "John@intel.com111", "intel12345111");
//			admin.addCompany(new Companies("company2", "companyemail2", "companypassword2")); //Working
//			admin.addCompany(new Companies("Intel", "John@intel.com", "intel12345")); //Working
//			admin.addCompany(new Companies("company3", "companyemail3", "companypassword3")); //Working
//			admin.deleteCompany(4); //Working
//			admin.addCustomer(new Customers("Nir", "Gal", "nirg@walla.com", "magenta2233")); //Working
//			admin.addCustomer(new Customers("Tom", "Benady", "tombe1@walla.com", "22031995")); //Working
//			admin.addCustomer(new Customers("Baruch", "Benady", "baruch@gmail.com", "326158")); //Working
//			admin.deleteCustomer(3); //Working
//			System.out.println(admin.getAllCompanies()); //Working
//			System.out.println(admin.getAllCustomers()); //Working
//			System.out.println(admin.getOneCompany(2)); //Working
//			System.out.println(admin.getOneCustomer(4)); //Working
//			admin.updateCompany(new Companies(3,"Intel111", "John@intel.com222", "omgItsWorking")); //Working
//			admin.updateCustomer(new Customers(2 ,"Tom", "Benady", "tombenady@gmail.com", "magenta")); //Working
		
			Calendar c = Calendar.getInstance();
			c.set(Calendar.YEAR, 2019);
			c.set(Calendar.MONTH, 7);
			c.set(Calendar.DAY_OF_MONTH, 25);
			Calendar cc = Calendar.getInstance();
			cc.set(Calendar.YEAR, 2019);
			cc.set(Calendar.MONTH, 11);
			cc.set(Calendar.DAY_OF_MONTH, 01);
			
			//Companies Tests: **ALL WORKING
			
			CompaniesFacade company = (CompaniesFacade) loginMan.login("John@intel.com222", "omgItsWorking", ClientType.Company); //Working
//			System.out.println(company.getCompanyDetails()); //Working
//			company.addCoupon(new Coupons(company.getCompanyDetails(), Categories.valueOf("Sport"), "Sport" , "Coupons for ski water at park darom",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 1000, 108.0, "some url")); //Working
//			company.addCoupon(new Coupons(company.getCompanyDetails(), Categories.valueOf("Cars"), "Cars" , "Coupons for car washe",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 200, 50.0, "some url")); //Working
//			company.deleteCoupon(2); //Working
//			company.updateCoupon(new Coupons(2 ,company.getCompanyDetails(), Categories.valueOf("Sport"), "Sport" , "Coupons for ski water at park darom",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 1000, 108.0, "OmgItsWorking")); //Working		
//			System.out.println(company.getCouponsByCategories(Categories.Sport)); //Working - - need to delete from repo
//			System.out.println(company.getCompanyCoupons()); //Working
//			System.out.println(company.getCompanyCoupons(Categories.Sport)); //Working
//			System.out.println(company.getCompanyCoupons(55)); //Working
			
			
			//Customers Tests: **ALL WORKING
			
			CustomersFacade customer = (CustomersFacade) loginMan.login("tombenady@gmail.com", "magenta", ClientType.Customer);
//			customer.purchaseCoupon(new Coupons(1 ,company.getCompanyDetails(), Categories.valueOf("Sport"), "Sport" , "Coupons for ski water at park darom",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 1000, 108.0, "some url")); //Working
//			customer.purchaseCoupon(new Coupons(3 ,company.getCompanyDetails(), Categories.valueOf("Cars"), "Cars" , "Coupons for car washe",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 200, 50.0, "some url")); //Working
//			customer.deleteCouponsPurchase(new Coupons(3 ,company.getCompanyDetails(), Categories.valueOf("Cars"), "Cars" , "Coupons for car washe",new Date(c.getTimeInMillis()), new Date(cc.getTimeInMillis()), 200, 50.0, "some url")); //Working
//			System.out.println(customer.getCustomerCoupons(Categories.Sport)); //Working
//			System.out.println(customer.getCustomerCoupons(200)); //Working
//			System.out.println(customer.getCustomerDetails()); //Working					

			
//			 t1.stop();


		} catch ( Exception  e) {
			System.out.println(e.getMessage());
		}


	}

}
