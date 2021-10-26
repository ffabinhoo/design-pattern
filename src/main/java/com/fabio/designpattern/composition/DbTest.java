package com.fabio.designpattern.composition;

public class DbTest{

	public static void main(String[] args) {
		
		WebSystemDb kill = new WebSystemDb();
		kill.db = new TestDB();
		
		kill.db.select();
		kill.db.update();


		
		
		
	}
}
