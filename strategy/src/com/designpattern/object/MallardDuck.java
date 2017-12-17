package com.designpattern.object;

import com.designpattern.flybehavior.FlyWithWings;
import com.designpattern.quackbehavior.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
	
}
