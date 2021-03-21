package com.cjhedu.enum_;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
public class EnumExercise {
    public static void main(String[] args) {
        //获取到所有的枚举对象，即数组
        Week[] weeks = Week.values();
        //增强for循环遍历数组
        System.out.println("所有的信息如下：");
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
enum Week{

    //定义枚举变量
    MONDAY("星期一"), TUESDAY("星期二"),
    WEDNESDAY("星期三"), THURSDAY("星期四"),
    FRIDAY("星期五"), SATURDAY("星期六"),
    SUNDAY("星期日");

    private String name;

    Week(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return name;
    }
}