package com.designPatterns.decoratorPattern;

/**
 * @Description: 抽象父类 抽象组件
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:23
 */
public abstract class Beverage {

    String description = "Unknown Beverage";
    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
