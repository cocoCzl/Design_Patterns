package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 Quack
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 15:21
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Quack >>");
    }
}
