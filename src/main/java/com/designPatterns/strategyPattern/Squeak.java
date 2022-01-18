package com.designPatterns.strategyPattern;

/**
 * @Description: 行为类 Squeak
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/18 16:47
 */
public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< Squeak >>");
    }
}
