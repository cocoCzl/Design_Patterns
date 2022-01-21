package com.designPatterns.decoratorPattern;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description: 装饰者模式
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/21 14:34
 */
@Slf4j(topic = "c.DecoratorPattern")
public class DecoratorPattern {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        Mocha mocha = new Mocha(beverage);
        log.debug(String.valueOf(mocha.cost()));
        log.debug(mocha.getDescription());


        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Milk(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        log.debug("{} : {}",houseBlend.getDescription(),houseBlend.cost());
    }
}
