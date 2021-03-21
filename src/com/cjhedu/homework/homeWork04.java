package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 *
 * 1.有一个交通工具接口类Vehicles，有work接口
 * 2.有Horse类和Boat类分别实现Vehicles
 * 3.创建交通工具工厂类，有两个方法分别实现获得交通工具Horse和Boat和AirPlant
 * 4.有Person类，有name和Vehicle属性，在构造器中为两个属性赋值
 * 5.实例化person类对象“唐僧”，要求一般情况下骑马，过河的时候用船过火焰山的时候开飞机
 *
 */
public class homeWork04 {
    public static void main(String[] args) {
        Person person = new Person("唐僧",new Horse());
        person.passRiver();
        person.common();
        person.hys();
    }
}

interface Vehicles{
    public void work();
}

class Horse implements Vehicles{

    @Override
    public void work() {
        System.out.println("平时骑马。。。。");
    }
}

class Boat implements Vehicles{

    @Override
    public void work() {
        System.out.println("过河开船。。。。");
    }
}

class AirPlant implements Vehicles{

    @Override
    public void work() {
        System.out.println("开飞机。。。。。");
    }
}


class VehicleFactory{
    //马儿始终是一匹马
    private static Horse horse = new Horse();

    private  VehicleFactory(){}
    //这里我们将方法做成static方便调用
    public static Horse getHorse(){
        return horse;
    }

    public static Boat getBoat(){
        return new Boat();
    }

    public static AirPlant getAirPlant(){
        return new AirPlant();
    }

}

class Person{
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    //把具体的要求，封装成方法
    public void passRiver(){
        //判断一下当前的vehicle是null，就获取船
        if (!(vehicles instanceof Boat)){
            vehicles = VehicleFactory.getBoat();
        }
        vehicles.work();
    }

    public void common(){
        if (!(vehicles instanceof Horse)){
           vehicles = VehicleFactory.getHorse();
        }
     //这个是接口类的调用
        vehicles.work();
    }

    public void hys(){
        if (!(vehicles instanceof AirPlant)){
            vehicles = VehicleFactory.getAirPlant();
        }
        vehicles.work();
    }

}