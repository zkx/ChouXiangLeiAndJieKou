/*
*
* 这里演示接口
*
* 电脑
*
* USB
*
* 相机   手机
*
* */

package com.zhangkai;


public class JieKou {
    public static void main(String []args){

       Computer com = new Computer();
       com.UseUSB(new Phone());

       com.UseUSB(new Camera());


       // Phone ph = new Phone();
      //  ph.Start();
    }
}

//定义USB接口 使用interface   ----不是定义类哦

//接口是不能被实例化
//接口方法不能有主体
interface  Usb{
    public void Start();

    public void End();
}

//定义手机类  完成接口
class Phone implements Usb,AddJieKou{

    @Override
    public void Start() {
        System.out.println("手机开始工作啦");
    }

    @Override
    public void Add() {

    }

    @Override
    public void End() {
        System.out.println("手机结束工作啦");
    }
}

//定义相机类  完成接口
class Camera implements Usb{

    @Override
    public void Start() {
        System.out.println("相机开始工作啦");
    }

    @Override
    public void End() {
        System.out.println("相机结束工作啦");
    }
}


//创建一个电脑类
//直接传参数为Usb接口
class Computer{
    public void UseUSB(Usb usb){
        usb.Start();
        usb.End();
    }

        }


        interface AddJieKou{
    int a = 1;//接口里面的变量本质上都是静态的 finial  必须要初始化
    public  void Add();
        }