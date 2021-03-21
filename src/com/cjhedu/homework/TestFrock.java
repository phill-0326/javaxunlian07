package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
public class TestFrock {
    public static void main(String[] args) {
        Frock frock = new Frock();

        System.out.println(frock.getNextNum());
        System.out.println(frock.getNextNum());
        System.out.println(frock.getNextNum());

        Frock frock1 = new Frock();
        Frock frock2 = new Frock();
        Frock frock3 = new Frock();
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
