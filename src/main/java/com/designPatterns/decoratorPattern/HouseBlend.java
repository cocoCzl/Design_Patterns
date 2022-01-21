package com.designPatterns.decoratorPattern;

/**
 * @Description: 具体组件
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 15:26
 */
public class HouseBlend extends Beverage{

    public HouseBlend(){
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
