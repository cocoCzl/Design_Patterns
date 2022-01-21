package com.designPatterns.decoratorPattern;

/**
 * @Description: 具体组件
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:28
 */
public class Decaf extends Beverage{

    public Decaf(){
        description = "Decaf";
    }
    @Override
    public double cost() {
        return 1.05;
    }
}
