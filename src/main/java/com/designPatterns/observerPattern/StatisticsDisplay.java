package com.designPatterns.observerPattern;

/**
 * @Description: 观察者 此布告板根据WeatherData显示最小、平均、最大的观测值
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 16:30
 */
public class StatisticsDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject subject){
        subject.registerObserver(this);
    }
    @Override
    public void display() {
        //显示最小、平均、最大的观测值
        System.out.println("<< Statistics >>");
        System.out.println("Max: " + Math.max(Math.max(temp,humidity),Math.max(temp,pressure)));
        System.out.println("Avg: " + (temp + humidity + pressure) / 3);
        System.out.println("min: " + Math.min(Math.min(temp,humidity),Math.min(temp,pressure)));
        System.out.println("<< Statistics End >>");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
