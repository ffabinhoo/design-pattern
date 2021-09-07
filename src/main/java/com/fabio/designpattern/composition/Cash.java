package com.fabio.designpattern.composition;

public class Cash implements PaymentMethod {

	@Override
	public void pay() {
		System.out.println("pay with cash");

	}

	@Override
	public void refund() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		System.out.println("print - cash");
	}

}
