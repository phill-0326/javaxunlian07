package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
public class homeWork05 {
    public static void main(String[] args) {
        Car car1 = new Car(33);
        Car car2 = new Car(-1);
        Car car3 = new Car(41);
        car1.getAir().flow();
        car2.getAir().flow();
        car3.getAir().flow();
    }
}

