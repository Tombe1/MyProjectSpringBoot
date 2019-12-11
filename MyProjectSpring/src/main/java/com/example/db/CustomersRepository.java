package com.example.db;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.beans.Coupons;
import com.example.beans.Customers;

public interface CustomersRepository extends JpaRepository<Customers, Integer> {
	
	Customers getCustomersByEmailAndPassword(String email ,String password);
	List<Customers> findCustomersByCustomerCoupons(Coupons cusCoupon);


}
