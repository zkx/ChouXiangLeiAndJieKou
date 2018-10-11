package com.zhangkai;

public class ChouXiangLei {

    public static void main(String []args){

        Dog dog1 = new Dog();
        dog1.fee();

    }
}

//建立一个抽象类
//用了抽象方法，类名必须也要加上abstract

//抽象类是不能被实例化的
abstract class Animal{
    abstract public void fee();
}

//继承抽象类的类，需要完成抽象类里的所有方法
class Dog extends Animal{

    @Override
    public void fee() {
        System.out.println("汪汪叫");
    }
}