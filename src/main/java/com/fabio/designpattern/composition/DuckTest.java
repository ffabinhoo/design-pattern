package com.fabio.designpattern.composition;

public class DuckTest {
	
	public static void main(String[] args) {
		Duck duck = new Duck();
		duck.flyBehaviour = new FlyMigration();
		duck.flyBehaviour.fly();
	}
}
