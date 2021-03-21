package com.cjhedu.abstract_;

public class CommonEmployee extends Employee{
    public CommonEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通工人"+getName()+"工作中.....");
    }
}
