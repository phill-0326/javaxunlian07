package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
public class Car {
    private double temperature;

    public Car(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("呼呼呼吹冷风！！！");
            } else if (temperature < 0) {
                System.out.println("呼呼呼出热风！！！");
            } else {
                System.out.println("呼呼呼吹你*嗨，老子不干了！！！");
            }
        }
    }
    //创造一个对象返回一个air对象
    public Air getAir(){
        return new Air();
    }
}
