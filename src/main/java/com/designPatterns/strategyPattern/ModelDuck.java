package com.designPatterns.strategyPattern;

/**
 * @Description: 具体类 模型鸭
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 16:57
 */
public class ModelDuck extends Duck{

    @Override
    public void display() {
        System.out.println("Model Duck");
    }

    public void swim(){
        System.out.println("Model Duck Swim");
    }
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
