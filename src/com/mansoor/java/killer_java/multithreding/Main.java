package com.mansoor.java.killer_java.multithreding;

public class Main {
    public static void main(String[] args) {

        Thread t1=new Thread();
        t1.start();
        System.out.println(Thread.currentThread().getName());

        Employee e1=new Employee();
        e1.start();
        System.out.println("Tread-1");

        Employee e2=new Employee();
        e2.start();
        System.out.println("Thread-2");

        Employee e3=new Employee();
        e3.start();
        System.out.println("Thread-3");

        Employee e4=new Employee();
        e4.start();
        System.out.println("Thread-4");

        System.out.println(Thread.activeCount());

    }
}
class Employee extends  Thread{
    @Override
    public void run(){
        System.out.println("run method from employee");
    }

}