package com.mansoor.java.killer_java.multithreding;

public class ByLamda {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1=() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread T1");
            }
        };
        Runnable r2=() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread T2");
            }
        };
        Thread t1=new Thread(r1,"T1");
        t1.start();

        Thread t2=new Thread(r2,"T2");
        t2.start();
    }
}