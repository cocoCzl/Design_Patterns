package com.designPatterns.decoratorPattern;

/**
 * @Description: 装饰者
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:29
 */
public class Milk extends CondimentDecorator{
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return 0.10 + beverage.cost();
    }

    public String getDescription(){
        return beverage.getDescription() + " : Milk";
    }
}
