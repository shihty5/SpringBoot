package com.proxy;

public class CarProxy2 implements Movable {

	private Movable m;

	public CarProxy2(Movable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		System.out.println("OOO1");
		m.move();
		System.out.println("OOO2");
	}

}
