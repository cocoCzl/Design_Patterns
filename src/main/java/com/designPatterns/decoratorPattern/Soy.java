package com.designPatterns.decoratorPattern;

/**
 * @Description: 装饰者
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:31
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }
    public double cost() {
        return beverage.cost() + 0.15;
    }

    public String getDescription(){
        return beverage.getDescription() + " : Soy";
    }
}
