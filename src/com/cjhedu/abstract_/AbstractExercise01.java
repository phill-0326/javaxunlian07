package com.cjhedu.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        new Manager("jack",23,3000,23333).work();
        new CommonEmployee("smith",12,34444).work();
    }
}
   abstract class Employee{
    private String name;
    private int id;
    private double salary;

       public Employee(String name, int id, double salary) {
           this.name = name;
           this.id = id;
           this.salary = salary;
       }

       public Employee() {
       }

       public String getName() {
           return name;
       }

       public void setName(String name) {
           this.name = name;
       }

       public int getId() {
           return id;
       }

       public void setId(int id) {
           this.id = id;
       }

       public double getSalary() {
           return salary;
       }

       public void setSalary(double salary) {
           this.salary = salary;
       }

       @Override
       public String toString() {
           return "Employee{" +
                   "name='" + name + '\'' +
                   ", id=" + id +
                   ", salary=" + salary +
                   '}';
       }

       //抽象方法
       public abstract void work();
   }