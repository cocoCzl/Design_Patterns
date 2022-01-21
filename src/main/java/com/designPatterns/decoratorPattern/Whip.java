package com.designPatterns.decoratorPattern;

/**
 * @Description: 装饰者
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:31
 */
public class Whip extends CondimentDecorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost() + 0.10;
    }

    public String getDescription(){
        return beverage.getDescription() + " : Whip";
    }
}
