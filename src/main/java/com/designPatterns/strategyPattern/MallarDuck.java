package com.designPatterns.strategyPattern;

/**
 * @Description: 具体类 野鸭
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 14:10
 */
public class MallarDuck extends Duck{

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void swim(){
        System.out.println("Mallar Duck Swim");
    }
    public void display(){
        System.out.println("Mallar Duck");
    }
}
