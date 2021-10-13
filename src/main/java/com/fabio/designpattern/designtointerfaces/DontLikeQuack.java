package com.fabio.designpattern.designtointerfaces;

public class DontLikeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("I don't like quack, sorry");
	}
}
