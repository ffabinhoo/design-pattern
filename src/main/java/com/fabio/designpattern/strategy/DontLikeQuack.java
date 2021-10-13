package com.fabio.designpattern.strategy;

public class DontLikeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("I don't like quack, sorry");
	}
}
