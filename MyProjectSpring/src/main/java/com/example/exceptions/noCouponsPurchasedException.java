package com.example.exceptions;

public class noCouponsPurchasedException extends Exception {
	
	public noCouponsPurchasedException() {
		super("No Coupons purchased!");
	}

}
