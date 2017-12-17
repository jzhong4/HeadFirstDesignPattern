package com.designpattern.object;

import com.designpattern.flybehavior.FlyNoWay;
import com.designpattern.quackbehavior.Squeak;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	public void display() {
		System.out.println("I'm a rubber duckie");
	}
	
}
