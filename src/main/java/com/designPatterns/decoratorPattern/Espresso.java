package com.designPatterns.decoratorPattern;

/**
 * @Description: 具体组件
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:27
 */
public class Espresso extends Beverage{
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
