package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 Fly
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 15:22
 */
public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I Can Fly......");
    }
}
