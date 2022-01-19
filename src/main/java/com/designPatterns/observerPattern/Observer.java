package com.designPatterns.observerPattern;

/**
 * @Description: 观察者接口 Subject
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 15:36
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
