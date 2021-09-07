package com.fabio.designpattern.composition;

public class TestDB implements AbstractDb {

	@Override
	public void select() {
		System.out.println("select no test");

	}

	@Override
	public void update() {
		System.out.println("update no test");

	}

}
