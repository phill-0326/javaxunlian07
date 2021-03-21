package com.cjhedu.homework;

/**
 * @author: phil
 * @ProjectName: javaxunlian07
 * @Date: 2021/3/21
 */
public class homeWork03 {
    public static void main(String[] args) {
      new A().f1();
    }
}
class A{
   private String name = "tom";
    public void f1(){
         class B{
            private final String name="jack";
            
            public String getName() {
                return name;
            }

            public void show(){
                System.out.println(getName()+A.this.name);
            }
            
        }
        B b = new B();
        b.show();
    }
}