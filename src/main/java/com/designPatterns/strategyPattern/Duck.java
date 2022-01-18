package com.designPatterns.strategyPattern;

/**
 * @Description: 超类 鸭子
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 14:10
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){};
    public abstract void display();

    void performQuack(){
        quackBehavior.quack();
    }

    void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
