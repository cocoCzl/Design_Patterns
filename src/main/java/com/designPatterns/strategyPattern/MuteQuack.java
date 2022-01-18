package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 Mute Quack
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 16:46
 */
public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
