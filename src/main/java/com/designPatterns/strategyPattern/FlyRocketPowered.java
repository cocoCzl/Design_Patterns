package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 Fly Rocket Powered
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 17:03
 */
public class FlyRocketPowered implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I fly with a rocket!");
    }
}
