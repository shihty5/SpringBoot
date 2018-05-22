package com.proxy;

public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        CarProxy c1 = new CarProxy(car);
        CarProxy2 c2 = new CarProxy2(c1);
        c2.move();
    }

}
