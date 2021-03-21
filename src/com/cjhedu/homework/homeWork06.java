package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 * 枚举和switch的结合使用
 */
public class homeWork06 {
    public static void main(String[] args) {
    //枚举值在switch使用
        Color color = Color.YELLOW;
        color.show();

        switch (color){
            case RED:
                System.out.println("匹配到红色！");
                break;
            case BLUE:
                System.out.println("匹配到蓝色！");
                break;
            case BLACK:
                System.out.println("匹配到黑色！");
                break;
            case GREEN:
                System.out.println("匹配到绿色！");
                break;
            case YELLOW:
                System.out.println("匹配到黄色！");
                break;
        }
    }
}

enum Color implements IColor {

    RED(255, 0, 0), BLACK(0, 0, 255),
    YELLOW(255, 255, 0), GREEN(0, 255, 0),
    BLUE(255, 23, 125);


    private int redValue;
    private int greenValue;
    private int blueValue;

    Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("属性值：" + redValue + "," + greenValue + "," + blueValue);
    }
}

interface IColor {
    public void show();
}