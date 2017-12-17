package com.designpattern.object;

import com.designpattern.flybehavior.FlyNoWay;
import com.designpattern.quackbehavior.MuteQuack;

public class DecoyDuck extends Duck {
	
	public DecoyDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new MuteQuack());
	}
	
	public void display() {
		System.out.println("I'm a duck Decoy");
	}
}
