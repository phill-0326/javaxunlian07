package com.cjhedu.homework;

import java.net.PortUnreachableException;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
 class Frock {
     private static int currentNum = 100000;
     private  int serialNumber;

    public Frock(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Frock() {
        serialNumber = getNextNum();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }


    public static int getNextNum(){
         return currentNum +=100;
     }

}
