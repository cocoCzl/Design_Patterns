package com.designPatterns.decoratorPattern;

/**
 * @Description: 具体组件
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:27
 */
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }
    @Override
    public double cost() {
        return 0.99;
    }
}
