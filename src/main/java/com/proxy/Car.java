package com.proxy;

import java.util.Random;

public class Car implements Movable {

    @Override
    public void move() {
        try {
            System.out.println("Driving..");
            Thread.sleep(new Random().nextInt(1000));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
