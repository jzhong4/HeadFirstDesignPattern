package com.designpattern.object;

import com.designpattern.flybehavior.FlyWithWings;
import com.designpattern.quackbehavior.Quack;

public class RedHeadDuck extends Duck {
	
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
	
}
