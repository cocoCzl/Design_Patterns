package com.designPatterns.strategyPattern;

import org.junit.Test;

/**
 * @Description: 策略模式 Strategy Pattern
 * FlyBehavior 飞行行为；QuackBehavior 叫声行为
 * 把每组行为想象成一个算法族，每一个算法族中的算法是可以互换的
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 11:34
 */
public class StrategyPattern {

    @Test
    public void testMallarDuck(){
        Duck duck = new MallarDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
        duck.swim();
        System.out.println("-------------Change-------------");
        FlyBehavior flyBehavior = new FlyNoWay();
        QuackBehavior quackBehavior = new Squeak();
        duck.setFlyBehavior(flyBehavior);
        duck.setQuackBehavior(quackBehavior);
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void testModelDuck(){
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();
        duck.display();
        duck.swim();
        System.out.println("-------------Change-------------");
        FlyBehavior flyBehavior = new FlyRocketPowered();
        duck.setFlyBehavior(flyBehavior);
        duck.performFly();
    }
}
