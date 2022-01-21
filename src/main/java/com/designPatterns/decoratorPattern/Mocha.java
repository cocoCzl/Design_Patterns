package com.designPatterns.decoratorPattern;

/**
 * @Description: 装饰者
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:30
 */
public class Mocha extends CondimentDecorator{
    //用一个实例变量记录饮料Beverage，也就是被装饰者
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }

    public String getDescription(){
        return beverage.getDescription() + " : Mocha";
    }
}
