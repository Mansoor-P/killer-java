package com.mansoor.java.design_pattrens.factory;

public
class AndroidDeveloper implements  Employee{
    @Override
    public
    int salary() {
        System.out.println("Getting Android developer Salary");
        return 500000;
    }
}
