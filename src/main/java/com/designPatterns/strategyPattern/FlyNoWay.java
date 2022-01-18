package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 not Fly
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 16:44
 */
public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I Can Not Fly......");
    }
}
