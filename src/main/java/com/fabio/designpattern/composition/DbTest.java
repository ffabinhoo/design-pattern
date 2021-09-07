package com.fabio.designpattern.composition;

public class DbTest{

	public static void main(String[] args) {
		
		WebSystem kill = new WebSystem();
		kill.db = new TestDB();
		
		kill.db.select();
		
		
		
	}
}
