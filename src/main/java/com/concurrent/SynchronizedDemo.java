package com.concurrent;

public class SynchronizedDemo {

    private boolean ready = false;
    private int result = 0;
    private int number = 1;

    public static void main(String[] args) {
        SynchronizedDemo synDemo = new SynchronizedDemo();

        synDemo.new ReadWriteThread(true).start();

        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

        synDemo.new ReadWriteThread(false).start();
    }

    public synchronized void write() {
        ready = true; // 1.1
        number = 2; // 1.2
    }

    public synchronized void read() {
        if (ready) { // 2.1
            result = number * 3; // 2.2
        }
        System.out.println("result " + result);
    }

    private class ReadWriteThread extends Thread {

        private boolean flag;

        public ReadWriteThread(boolean flag) {
            this.flag = flag;
        }

        @Override
        public void run() {
            if (flag) {
                write();
            } else {
                read();
            }
        }
    }
}
