package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * 匿名内部类的简单使用
 * @Date: 2021/3/21
 */
public class homeWork02 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Ical() {//匿名内部类可以直接做一个对象传入
            @Override
            public double work(double n1, double n2) {
                return n1*n2;
            }
        },23,12);
    }
}
interface Ical{//计算机的接口类
   public double work(double n1,double n2);
}

class Cellphone {
    public void testWork(Ical ical,double n1,double n2) {//testWork方法调用接口的work方法
        double result = ical.work(n1, n2);
        System.out.println("计算的结果是："+result);
    }
}