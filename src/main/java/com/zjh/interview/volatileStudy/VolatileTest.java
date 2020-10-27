package com.zjh.interview.volatileStudy;

/**
 * @author: jinheng.zhao
 * @create: 2020-08-28
 **/
public class VolatileTest {


    private static volatile Boolean flag = false;

    private static volatile String message;

    static class VolatileThread extends Thread{

        @Override
        public void run() {
            while (true){
                while (!flag){
                    System.out.println("VolatileThread flag="+flag);
                    flag=true;
                }
            }
        }
    }

    static class VolatileThread1 extends Thread{

        @Override
        public void run() {
            while (true) {
                while (flag) {

                    System.out.println("VolatileThread1 flag=" + flag);
                    flag = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        VolatileThread thread = new VolatileThread();

        VolatileThread1 thread1 = new VolatileThread1();

        thread.start();
        System.out.println("thread 线程启动");

        thread1.start();
        System.out.println("thread1 线程启动");
    }
}
