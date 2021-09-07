package com.fabio.designpattern.composition;

public class CommercialDB implements AbstractDb {

	@Override
	public void select() {
		System.out.println("select commercial db");

	}

	@Override
	public void update() {
		System.out.println("update commercial db");

	}

}
