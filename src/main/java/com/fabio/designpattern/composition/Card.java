package com.fabio.designpattern.composition;

public class Card implements PaymentMethod{

	@Override
	public void pay() {
		System.out.println(" pay with card");
	}

	@Override
	public void refund() {
		System.out.println("refund - card");
		
	}

	@Override
	public void print() {
		System.out.println("print - card");
		
	}

}
