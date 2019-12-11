package com.example.exceptions;

public class ExpiredCouponException extends Exception {
	
	public ExpiredCouponException() {
		super("Coupon expired!");
	}

}
