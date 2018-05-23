package com.proxy.jdkproxy;

import com.proxy.Car;
import com.proxy.Movable;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        Class<?> cls = car.getClass();

        InvocationHandler h = new TimeHandler(car);

        Movable m = (Movable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);

        m.move();
    }

}
