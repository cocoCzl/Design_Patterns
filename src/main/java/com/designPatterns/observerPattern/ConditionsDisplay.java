package com.designPatterns.observerPattern;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description: 观察者 此布告板根据WeatherData显示当前观测值 实现Observer接口
 * @Author: czl []~(￣▽￣)~*)
 * @Date: 2022/1/19 17:29
 */
public class ConditionsDisplay implements Observer, DisplayElement{

    private float temp;
    private float humidity;
    private float pressure;

    public ConditionsDisplay(Observable observable){
        //把自己登记为观察者
        observable.addObserver(this);
    }

    @Override
    public void display() {
        //显示当前观测值
        System.out.println("<< Current Conditions >>");
        System.out.println("temp: " + temp);
        System.out.println("humidity: " + humidity);
        System.out.println("pressure: " + pressure);
        System.out.println("<< Current Conditions End >>");
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof Weather){
            Weather weather = (Weather) o;
            this.temp = weather.getTemperature();
            this.humidity = weather.getHumidity();
            this.pressure = weather.getPressure();
            display();
        }
    }
}
