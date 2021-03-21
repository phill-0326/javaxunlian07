package com.cjhedu.abstract_Annoynous;

public class interface01 {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("闹铃想了.....");
            }
        });

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小懒猪起床啦");
            }
        });
    }
}
 interface Bell {
    void ring();
}

class CellPhone{
    public void alarmClock(Bell bell) {
        bell.ring();
    }
}
