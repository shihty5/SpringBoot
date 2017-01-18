package com.proxy;

public class CarProxy implements Movable {

	private Movable m;

	public CarProxy(Movable m) {
		super();
		this.m = m;
	}

	@Override
	public void move() {
		System.out.println("time1");
		m.move();
		System.out.println("time2");
	}

}
